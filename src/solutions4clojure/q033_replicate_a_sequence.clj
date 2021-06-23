(ns solutions4clojure.q033-replicate-a-sequence)

(def __ #(apply mapcat vector (repeat %2 %1)))