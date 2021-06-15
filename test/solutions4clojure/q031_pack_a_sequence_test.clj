(ns solutions4clojure.q031-pack-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q031-pack-a-sequence :refer :all]))

(deftest answer-test
  (is (= (answer [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (is (= (answer [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (is (= (answer [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))