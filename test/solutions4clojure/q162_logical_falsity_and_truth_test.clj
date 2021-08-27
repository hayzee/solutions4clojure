(ns solutions4clojure.q162-logical-falsity-and-truth-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q162-logical-falsity-and-truth :refer :all]))

(deftest answer-test
  (is (= __ (if-not false 1 0)))
  (is (= __ (if-not nil 1 0)))
  (is (= __ (if true 1 0)))
  (is (= __ (if [] 1 0)))
  (is (= __ (if [0] 1 0)))
  (is (= __ (if 0 1 0)))
  (is (= __ (if 1 1 0))))