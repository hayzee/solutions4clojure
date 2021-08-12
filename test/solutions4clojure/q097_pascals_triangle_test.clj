(ns solutions4clojure.q097-pascals-triangle-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q097-pascals-triangle :refer :all]))

(deftest answer-test
  (= (__ 1) [1])
  (= (map __ (range 1 6))
    [[1]
     [1 1]
     [1 2 1]
     [1 3 3 1]
     [1 4 6 4 1]])
  (= (__ 11)
    [1 10 45 120 210 252 210 120 45 10 1]))