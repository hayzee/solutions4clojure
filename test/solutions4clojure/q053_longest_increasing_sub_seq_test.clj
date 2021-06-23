(ns solutions4clojure.q053-longest-increasing-sub-seq-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q053-longest-increasing-sub-seq :refer :all]))

(deftest answer-test
  (is (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (is (= (__ [5 6 1 3 2 7]) [5 6]))
  (is (= (__ [2 3 3 4 5]) [3 4 5]))
  (is (= (__ [7 6 5 4]) [])))
