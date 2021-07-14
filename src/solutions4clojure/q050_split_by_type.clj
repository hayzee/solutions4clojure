(ns solutions4clojure.q050-split-by-type)

(def __
  #(map second (group-by type %)))
