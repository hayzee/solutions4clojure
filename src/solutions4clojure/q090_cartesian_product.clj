(ns solutions4clojure.q090-cartesian-product)

(def __
  (fn [s1 s2]
    (set
      (for [e1 s1
            e2 s2]
        [e1 e2]))))
