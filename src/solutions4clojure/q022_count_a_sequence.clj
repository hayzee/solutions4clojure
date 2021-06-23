(ns solutions4clojure.q022-count-a-sequence)

(def __ #(reduce (fn [a _] (inc a)) 0 %))