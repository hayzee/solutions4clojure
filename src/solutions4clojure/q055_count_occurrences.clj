(ns solutions4clojure.q055-count-occurrences)

(def __
  (fn [s] (reduce #(update-in %1 [%2] (fnil inc 0)) {} s)))
