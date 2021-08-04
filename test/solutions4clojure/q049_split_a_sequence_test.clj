(ns solutions4clojure.q049-split-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q049-split-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
  (is (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
  (is (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))