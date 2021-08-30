(ns solutions4clojure.q124-analyze-reversi)


; Broken down solution

; Define a board

(def board
  '[[a b c d e]
    [f g h i j]
    [k l m n o]
    [p q r s t]
    [u v w x y]])

; A test board

(def board '[[e e w e]
             [b b w e]
             [b w w e]
             [b w w w]])

; height

(defn board-height
  "Given square board, return the height (no of rows)"
  [board]
  (count board))

(board-height board)

;width

(defn board-width
  "Given square board, return the width (no of cols)"
  [board]
  (count (first board)))

(board-width board)

(defn all-coords
  "Given a board, return a full set of [r c] pairs for all positions on the board"
  [board]
  (for [r (range (count board))             ; height
        c (range (count (first board)))]    ; width
    [r c]))

(all-coords board)

(defn empties
  "Given a board, return a full set of [r c] pairs for all empty positions on the board"
  [board]
  (filter #(= 'e (get-in board %)) (all-coords board)))

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
    (iterate f-dir [r c])                   ; coords
    (map #(vector % (get-in board %)))      ; augment with board values
    (take-while second)                     ; constrain to board (assumes no board value can be nil)
    #_(partition-by #(identity (second %)))))

(vals-from board [0 0] south)

(defn toggle
  "Tobble 'b to 'w and vice versa"
  [counter]
  (first (disj '#{b w} counter)))

(defn flips [board [r c] counter f-dir]
  (let [[f s t] (partition-by #(identity (second %)) (vals-from board [r c] f-dir))]
    (println :f f :s s :t t)
    (when (and
            (= (count f) 1)
            (= (second (first f)) 'e)
            (= (second (first s)) (toggle counter))
            (= (second (first t)) counter)
            )
      s)))

(defn all-flips [board [r c] counter]
  (let [f-flipper (partial flips board [r c] counter)]
    (map f-flipper [north no-ea east so-ea south so-we west no-we]
    )))

(keep identity (all-flips board [0 3] 'b))





;; OLD STUFF
(comment (def board
           [
            [1 2 3 4]
            [6 7 8 9]
            [11 12 13 14]
            [16 17 18 19]
            ])

  (def board '[[e e w e]
               [b b w e]
               [b w w e]
               [b w w w]])

  (def vboard (vec (mapcat identity board)))

  (defn offset [x y]
    (+ (* 4 x) y))

  (offset 1 2)

  (vboard (offset 1 0))

  (defn vecs [board [x y]]
    {
     :left  (for [x (range x 0 -1)] [x y])
     :right (for [x (range x 4)] [x y])
     :up    (for [y (range y 0 -1)] [x y])
     :down  (for [y (range y 4)] [x y])
     })


  (let [
        move-fn (fn [fns] (partial mapv #(%1 %2) fns))
        f-no (move-fn [identity dec])
        f-ne (move-fn [inc dec])
        f-ea (move-fn [inc identity])
        f-se (move-fn [inc inc])
        f-so (move-fn [identity inc])
        f-sw (move-fn [dec inc])
        f-we (move-fn [dec identity])
        f-nw (move-fn [dec dec])
        f-mvvec (fn [f-dir coord]
                  (take-while #(not (some #{-1 4} %)) (iterate f-dir coord)))
        mv-vecs (fn [] [
                        (f-mvvec f-no [1 3])
                        (f-mvvec f-ne [1 3])
                        (f-mvvec f-ea [1 3])
                        (f-mvvec f-se [1 3])
                        (f-mvvec f-so [1 3])
                        (f-mvvec f-sw [1 3])
                        (f-mvvec f-we [1 3])
                        (f-mvvec f-nw [1 3])
                        ])
        linevals (fn [line-coords] (map #(get-in board %) line-coords))

        ]
    ;(take-while #(not (some #{-1 4} %)) (iterate f-no [1 3]))
    ;(filter nnext (moves))
    (map linevals (mv-vecs))
    )




  ;(defn vec-from
  ;  "Given a board, a starting position [r c] and a direction to f-dir,
  ;  return a vector of all the positions from [r c] in that direction."
  ;  [board [r c] f-dir]
  ;  (take-while
  ;    (fn [[r c]]
  ;      (and
  ;        (<= 0 r (dec (board-height board)))
  ;        (<= 0 c (dec (board-width board)))))
  ;    (iterate f-dir [r c])))
  ;
  ;(vec-from board [0 0] so-ea)
  ;
  ;(defn vals-from [board [r c] f-dir]
  ;  "Given a board, a starting position [r c] and a direction to f-dir,
  ;  return a vector of all the positions from [r c] in that direction
  ;  plus their corresponding value v, returning a vector of [[r c] v]"
  ;  (map #(vector % (get-in board %)) (vec-from board [r c] f-dir)))

  )