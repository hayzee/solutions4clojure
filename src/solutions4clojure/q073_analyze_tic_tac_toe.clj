(ns solutions4clojure.q073-analyze-tic-tac-toe)

(def __
  (fn [board]
    (first (first (filter #(and (= 1 (count %)) (not-empty (clojure.set/intersection #{:o :x} %)))
                    (clojure.set/union
                      ; rows
                      (set (map #(into #{} %) board))
                      ; cols
                      (set (for [i (range 3)]
                             (set (map #(nth % i) board))))
                      ;diag l-r
                      (set (list (set (for [i (range 3)]
                                        (get-in board [i i])))
                             ;diag r-l
                             (set (for [i (range 3)]
                                    (get-in board [i (- 2 i)])))))))))))