(ns solutions4clojure.q158-decurry)

(def __
  (fn decurry [f]
    (fn [& args] (reduce (fn [a e] (a e)) f args))))
