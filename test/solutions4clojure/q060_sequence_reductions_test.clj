(ns solutions4clojure.q060-sequence-reductions-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q060-sequence-reductions :refer :all]))

(deftest answer-test
  (is (= (take 5 (__ + (range))) [0 1 3 6 10]))
  (is (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))