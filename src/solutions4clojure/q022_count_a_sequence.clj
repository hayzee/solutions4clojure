(ns solutions4clojure.q022-count-a-sequence)

(def answer #(reduce (fn [a _] (inc a)) 0 %))