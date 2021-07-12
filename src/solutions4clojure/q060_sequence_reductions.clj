(ns solutions4clojure.q060-sequence-reductions)

(def __
  (fn r
    ([f a s]
     (if (empty? s)
       (list a)
       (lazy-seq (cons a (r f (f a (first s)) (rest s))))))
    ([f s]
     (r f (first s) (rest s)))))
