(ns solutions4clojure.q058-function-composition)

(def __
  (fn c
    ([f1] f1)
    ([f1 f2] (fn [& a] (f1 (apply f2 a))))
    ([f1 f2 & m] (apply c (cons (c f1 f2) m)))))
