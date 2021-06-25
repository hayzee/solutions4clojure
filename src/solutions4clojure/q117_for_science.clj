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
