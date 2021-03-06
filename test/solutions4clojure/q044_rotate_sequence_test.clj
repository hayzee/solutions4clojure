(ns solutions4clojure.q044-rotate-sequence-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q044-rotate-sequence :refer :all]))

(deftest answer-test
  (is (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (is (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (is (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (is (= (__ 1 '(:a :b :c)) '(:b :c :a)))
  (is (= (__ -4 '(:a :b :c)) '(:c :a :b))))