(ns solutions4clojure.q032-duplicate-a-sequence-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q032-duplicate-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))