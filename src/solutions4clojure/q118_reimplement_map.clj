(ns solutions4clojure.q118-reimplement-map)

(def __
  (fn mymap [f s]
    (when (first s)
      (lazy-seq (cons (f (first s)) (mymap f (rest s)))))))