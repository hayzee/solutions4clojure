(ns solutions4clojure.q088-symmetric-difference)

; (s1 u s2) - (s1 n s2)
(def __
  (fn [s1 s2]
    (reduce disj
      (reduce conj s2 s1)
      (keep s1 s2))))