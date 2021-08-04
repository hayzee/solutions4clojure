(ns solutions4clojure.q049-split-a-sequence)

(def __
  (fn [n s]
    (list (take n s) (drop n s))))
