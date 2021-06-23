(ns solutions4clojure.q026-fibonacci-sequence)

(def __ #(take % (map first (iterate (fn [[x y]] [y (+ y x)]) [1 1]))))