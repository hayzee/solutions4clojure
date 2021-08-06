(ns solutions4clojure.q063-group-a-sequence)

(def __
  (fn [f s]
    (reduce (fn [m e] (update-in m [(f e)] (fnil conj []) e)) {} s)))
