(ns solutions4clojure.q012-intro-to-sequences-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q012-intro-to-sequences :refer :all]))

(deftest answer-test
  (is (= answer (first '(3 2 1))))
  (is (= answer (second [2 3 4])))
  (is (= answer (last (list 1 2 3)))))