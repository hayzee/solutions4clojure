(ns solutions4clojure.q117-for-science)

(def __
  (fn solvable? [in-board]
    (let [board (map #(str "#" % "#") in-board)
          cols (count (first board))
          board-vector (vec (mapcat seq board))
          state {:board-vec board-vector :mouse-idx (.indexOf board-vector \M)}
          cheese-idx (.indexOf board-vector \C)
          legal-moves (fn [state]
                        (let [idx (state :mouse-idx)]
                          (filter #(and
                                     ((complement neg?) %)
                                     (> #_board-size (count (state :board-vec)) %)
                                     (contains? #{\space \C} (nth (state :board-vec) %)))
                            [(dec idx) (inc idx) (+ idx cols) (- idx cols)])))
          solved? (fn solved? [state]
                    (not= \C (nth (state :board-vec) cheese-idx)))
          generator (fn [state]
                      (if (not (solved? state))
                        (map
                          #(assoc state
                             :board-vec (assoc (state :board-vec) % "X")
                             :mouse-idx %)
                          (legal-moves state))))
          solver (fn [state generator solved?]
                   (let [find-all-states
                         (fn find-all-states [state]
                           (let [fabs (for [new-state (generator state)
                                            fab (find-all-states new-state)] fab)]
                             (if (solved? state)
                               (cons state fabs)
                               fabs)))]
                     (find-all-states state)))]
      (->
        (solver state generator solved?)
        first
        boolean))))


(comment


  (defn terminal?
    ;; This state has no further possible moves
    [s]
    (= 4 (count s)))

  (defn target?
    ;; Check if `s is in the goal state
    [s]
    (= 4 (count s) (count (distinct s))))

  (defn genmoves
    ;; given state `s generate some legal moves [`s1, `s2, ... `sn]
    [s]
    (for [x (range 10)]
      (cons x s)))

  (defn breadth-first [s]
    (iterate #(mapcat genmoves %) (genmoves s)))

  (last (take 6 (breadth-first '())))

  (mapcat identity [[1 2 3] [4 5 6]])

  (defn moves [s]
    (if (seq s)
      s))


  (defn next-move [s]
    (if (= 3 (count s))
      s
      (for [n (range 4)
            m (next-move (cons n s))]
        m)))

  (take 10 (next-move []))


  (defn term? [s]
    (= 4 (count s)))

  )
