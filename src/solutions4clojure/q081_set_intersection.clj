(ns solutions4clojure.q081-set-intersection)

(def __
  #(reduce (fn [a e] (set (keep e a))) %&))
