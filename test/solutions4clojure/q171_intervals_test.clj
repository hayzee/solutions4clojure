(ns solutions4clojure.q171-intervals-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q171-intervals :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3]) [[1 3]]))
  (is (= (__ [10 9 8 1 2 3]) [[1 3] [8 10]]))
  (is (= (__ [1 1 1 1 1 1 1]) [[1 1]]))
  (is (= (__ []) []))
  (is (= (__ [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
        [[1 4] [6 6] [9 11] [13 17] [19 19]])))
