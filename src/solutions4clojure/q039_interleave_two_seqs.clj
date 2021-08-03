(ns solutions4clojure.q039-interleave-two-seqs)

(def __
  (fn [s1 s2]
    (flatten (map vector s1 s2))))
