(ns solutions4clojure.q034-implement-range)

(def answer (fn [n m] (take-while #(< % m) (iterate inc n))))
