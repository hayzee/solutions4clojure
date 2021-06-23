(ns solutions4clojure.q012-intro-to-sequences-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q012-intro-to-sequences :refer :all]))

(deftest answer-test
  (is (= __ (first '(3 2 1))))
  (is (= __ (second [2 3 4])))
  (is (= __ (last (list 1 2 3)))))