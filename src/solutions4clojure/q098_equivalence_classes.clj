(ns solutions4clojure.q098-equivalence-classes)

(def __
  #(set (map set (vals (group-by %1 %2)))))