(ns solutions4clojure.q069-merge-with-a-function)

(def __
  #(reduce
     (fn [m [k v]]
       (update-in m [k] (fn [c] (if c (% c v) v))))
     {}
     (apply concat %&)))
