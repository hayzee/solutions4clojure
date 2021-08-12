(ns solutions4clojure.q097-pascals-triangle)

(def __
  (fn [n]
    (let [nextpasc (fn [row] (cons 1 (concat (map (partial apply +) (partition 2 1 row)) '(1))))]
      (last (take n (cons [1] (iterate nextpasc [1 1])))))))
