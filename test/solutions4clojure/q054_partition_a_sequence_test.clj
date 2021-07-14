(ns solutions4clojure.q054-partition-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q054-partition-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
  (is (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
  (is (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))))