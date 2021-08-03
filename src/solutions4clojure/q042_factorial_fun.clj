(ns solutions4clojure.q042-factorial-fun)

(def __
  (fn [n] (reduce * (range 1 (inc n)))))
