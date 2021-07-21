(ns solutions4clojure.q144-oscilrate-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q144-oscilrate :refer :all]))

(deftest answer-test
  (is (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
  (is (= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
  (is (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])))
