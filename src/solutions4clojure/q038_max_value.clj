(ns solutions4clojure.q038_max_value)

(def __
  (fn [& s] (reduce (fn [x y] (if (> x y) x y)) s)))
