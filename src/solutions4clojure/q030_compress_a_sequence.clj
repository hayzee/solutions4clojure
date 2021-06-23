(ns solutions4clojure.q030-compress-a-sequence)

(def __ #(reduce (fn [a e] (if (= e (last a)) a (conj a e))) [] (vec %)))