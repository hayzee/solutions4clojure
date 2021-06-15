(ns solutions4clojure.q034-implement-range-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q034-implement-range :refer :all]))

(deftest answer-test
  (is (= (answer 1 4) '(1 2 3)))
  (is (= (answer -2 2) '(-2 -1 0 1)))
  (is (= (answer 5 8) '(5 6 7))))