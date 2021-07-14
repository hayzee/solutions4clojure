(ns solutions4clojure.q043-reverse-interleave)

(def __
  #(apply map vector (partition %2 %1)))