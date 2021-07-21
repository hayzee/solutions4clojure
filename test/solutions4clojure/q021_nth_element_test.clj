(ns solutions4clojure.q021-nth-element-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q021-nth-element :refer :all]))

(deftest answer-test
  (is (= (__ '(4 5 6 7) 2) 6))
  (is (= (__ [:a :b :c] 0) :a))
  (is (= (__ [1 2 3 4] 1) 2))
  (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])))