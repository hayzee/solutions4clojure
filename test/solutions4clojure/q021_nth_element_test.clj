(ns solutions4clojure.q021-nth-element-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q021-nth-element :refer :all]))

(deftest answer-test
  (is (= (answer '(4 5 6 7) 2) 6))
  (is (= (answer [:a :b :c] 0) :a))
  (is (= (answer [1 2 3 4] 1) 2))
  (is (= (answer '([1 2] [3 4] [5 6]) 2) [5 6])))