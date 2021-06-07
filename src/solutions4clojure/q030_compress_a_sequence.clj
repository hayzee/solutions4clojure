(ns solutions4clojure.q030-compress-a-sequence)

(def answer #(reduce (fn [a e] (if (= e (last a)) a (conj a e))) [] (vec %)))