(ns solutions4clojure.q023-reverse-a-sequence)

(def answer (fn [s] (reduce #(cons %2 %1) '() s)))