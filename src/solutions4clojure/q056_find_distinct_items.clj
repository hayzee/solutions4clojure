(ns solutions4clojure.q056-find-distinct-items)

(def __
  #(reduce (fn [a e] (if (some #{e} a) a (conj a e))) [] %1))
