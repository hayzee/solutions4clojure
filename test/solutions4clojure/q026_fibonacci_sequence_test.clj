(ns solutions4clojure.q026-fibonacci-sequence-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q026-fibonacci-sequence :refer :all]))

(deftest answer-test
  (is (= (__ 3) '(1 1 2)))
  (is (= (__ 6) '(1 1 2 3 5 8)))
  (is (= (__ 8) '(1 1 2 3 5 8 13 21))))