(ns solutions4clojure.q047-contain-yourself-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q047-contain-yourself :refer :all]))

(deftest answer-test
  (is (contains? #{4 5 6} __))
  (is (contains? [1 1 1 1 1] __))
  (is (contains? {4 :a 2 :b} __))
  (is (not (contains? [1 2 4] __))))