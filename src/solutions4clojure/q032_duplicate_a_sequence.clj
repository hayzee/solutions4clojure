(ns solutions4clojure.q032-duplicate-a-sequence)

(def answer #(mapcat vector % %))
