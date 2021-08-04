(ns solutions4clojure.q062-reimplement-iterate)

(def __
  (fn f-iter [f v]
    (lazy-seq (cons v (f-iter f (f v))))))
