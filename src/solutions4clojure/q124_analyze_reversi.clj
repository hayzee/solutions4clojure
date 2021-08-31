(ns solutions4clojure.q124-analyze-reversi)

(def __
  (fn moves [board counter]
    (let [empties (for [r (range (count board))
                        c (range (count (first board)))
                        :when (= 'e (get-in board [r c]))
                        ]
                    [r c])
          get-linevec (fn [board [r c] [ro co]]
                        (->>
                          (iterate #(mapv + [ro co] %) [r c])
                          (map #(hash-map :pos % :val (get-in board %)))
                          (take-while :val)))
          get-linevec-flips (fn [board [r c] [ro co] counter]
                              (let [[p1 p2 p3 & _ :as p]
                                    (partition-by #(identity (:val %)) (get-linevec board [r c] [ro co]))]
                                (when (and
                                        (= 1 (count p1))
                                        (= 'e (:val (first p1)))
                                        (= (first (disj '#{b w} counter)) (:val (first p2)))
                                        (= counter (:val (first p3)))
                                        )
                                  (map :pos p2))))
          get-all-linevec-flips (fn [board [r c] counter]
                                  (vector
                                    [r c]
                                    (set
                                      (mapcat
                                        #(get-linevec-flips board [r c] % counter)
                                        (for [x [-1 0 1] y [-1 0 1] :when (not= 0 x y)] [x y])))))
          ]
      (into {} (remove (comp empty? second) (map #(get-all-linevec-flips board % counter) empties)))))
  )








(comment

  ;; Another older (working) solution (broken down).

  (defn empties
    "Given a board, return a full set of [r c] pairs for all empty positions on the board"
    [board]
    (->>
      (for [row (range (count board))                                 ; height
            col (range (count (first board)))]                        ; width
        [row col])
      (filter #(= 'e (get-in board %)))))

  (empties board)

  (defn north
    "Transform a [r c] co-ordinate in a northerly direction"
    [[r c]] [(dec r) c])

  (defn no-ea
    "Transform a [r c] co-ordinate in a north-easterly direction"
    [[r c]] [(dec r) (inc c)])

  (defn east
    "Transform a [r c] co-ordinate in an easterly direction"
    [[r c]] [r (inc c)])

  (defn so-ea
    "Transform a [r c] co-ordinate in a south-easterly direction"
    [[r c]] [(inc r) (inc c)])

  (defn south
    "Transform a [r c] co-ordinate in a southerly direction"
    [[r c]] [(inc r) c])

  (defn so-we
    "Transform a [r c] co-ordinate in a south-westerly direction"
    [[r c]] [(inc r) (dec c)])

  (defn west
    "Transform a [r c] co-ordinate in a westerly direction"
    [[r c]] [r (dec c)])

  (defn no-we
    "Transform a [r c] co-ordinate in a north-westerly direction"
    [[r c]] [(dec r) (dec c)])


  (defn vals-from
    "Given a board, a starting position [r c] and a direction function
    f-dir, return a vector of all the positions from [r c] in that direction
    plus their corresponding value v, returning a vector of:
    [ [[r0 c0] v0] [[r1 c1] v1] .... [[rn cn] vn] ]"
    [board [r c] f-dir]
    (->>
      (iterate f-dir [r c])                                           ; coords
      (map #(vector % (get-in board % ::notfound)))                   ; augment with board values
      (take-while #(not= ::notfound (second %)))))                    ; constrain to board (assumes no board value can be nil)

  (vals-from board [0 0] south)

  (defn toggle
    "Toggle counter 'b to 'w and vice versa"
    [counter]
    (first (disj '#{b w} counter)))

  (defn flipped-vals-from
    "Given a board, a starting position [r c] a counter colour ('b or 'w),
    and a direction function f-dir, return a vector of all the positions
    from [r c] in that direction plus their corresponding value v, where
    the position would be flipped by the move [r c] for the counter, returning
    a vector of: [ [[r0 c0] v0] [[r1 c1] v1] .... [[rn cn] vn] ]"
    [board [r c] f-dir counter]
    (let [[f s t] (partition-by #(identity (second %)) (vals-from board [r c] f-dir))]
      (when (and
              (= (count f) 1)
              (= (second (first f)) 'e)
              (= (second (first s)) (toggle counter))
              (= (second (first t)) counter))
        s)))

  (def board '[[b w w e]
               [w w w w]
               [w w w w]
               [b w w b]])

  (flipped-vals-from board [0 3] so-we 'b)
  (flipped-vals-from board [0 3] west 'b)
  (flipped-vals-from board [0 3] south 'b)

  (def board '[[e e e e]
               [e w b e]
               [e b w e]
               [e e e e]])

  (flipped-vals-from board [0 1] north 'w)

  (defn all-flipped-vals-from [board [r c] counter]
    (vector [r c]
      (set
        (map first
          (mapcat
            #(flipped-vals-from board [r c] % counter)
            [north no-ea east so-ea south so-we west no-we])))))

  (all-flipped-vals-from board [0 1] 'w)

  (defn all-moves [board counter]
    (into {} (filter #(seq (second %))
               (map
                 #(all-flipped-vals-from board % counter)
                 (empties board)
                 ))))

  (all-moves '[[e e e e]
               [e w b e]
               [e b w e]
               [e e e e]] 'w)

  (def __ all-moves)

  (= {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}}
    (__ '[[e e e e]
          [e w b e]
          [e b w e]
          [e e e e]] 'w))

  (= {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}}
    (__ '[[e e e e]
          [e w b e]
          [w w w e]
          [e e e e]] 'b))

  (= {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}}
    (__ '[[e e e e]
          [e w b e]
          [w w b e]
          [e e b e]] 'w))

  (= {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 1] [2 2]}}
    (__ '[[e e w e]
          [b b w e]
          [b w w e]
          [b w w w]] 'b))

  )
