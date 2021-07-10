(ns solutions4clojure.q078-reimplement-trampoline)

(def __
  (fn t
    ([f] (if (fn? f) (t (f)) f))
    ([f & a] (t (apply f a)))))


; previous solution
;(def __
;  (fn [f & args]
;    (first (drop-while fn? (iterate #(do (%)) (apply f args))))))
