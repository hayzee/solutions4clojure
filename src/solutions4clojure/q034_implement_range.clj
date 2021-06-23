(ns solutions4clojure.q034-implement-range)

(def __ (fn [n m] (take-while #(< % m) (iterate inc n))))
