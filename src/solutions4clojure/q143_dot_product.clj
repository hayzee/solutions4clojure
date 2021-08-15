(ns solutions4clojure.q143-dot-product)

(def __
  (fn [v1 v2]
    (reduce + (map * v1 v2))))