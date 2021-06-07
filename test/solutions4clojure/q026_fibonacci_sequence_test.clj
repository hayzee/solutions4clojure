(ns solutions4clojure.q026-fibonacci-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q026-fibonacci-sequence :refer :all]))

(deftest answer-test
  (is (= (answer 3) '(1 1 2)))
  (is (= (answer 6) '(1 1 2 3 5 8)))
  (is (= (answer 8) '(1 1 2 3 5 8 13 21))))