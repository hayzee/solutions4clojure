(ns solutions4clojure.q023-reverse-a-sequence)

(def __ (fn [s] (reduce #(cons %2 %1) '() s)))