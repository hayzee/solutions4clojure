(ns solutions4clojure.q110-sequence-of-pronunciations)

(def __
  (fn pronunciations [s]
    (let [group-same (fn group-same [s]
                       (if (empty? s)
                         (list)
                         (let [[h t](split-with #(= % (first s)) s)]
                           (cons h (lazy-seq (group-same t))))))
          codify (fn [grp-s]
                   (flatten (map (fn [s] (vector (count s) (first s))) (group-same grp-s))))]
      (rest (iterate codify s)))))
