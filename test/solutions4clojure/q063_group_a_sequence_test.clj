(ns solutions4clojure.q063-group-a-sequence-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q063-group-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]}))
  (is (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
         {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
  (is (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
         {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))
