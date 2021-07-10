(ns solutions4clojure.q115-balance-of-n-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q115-balance-of-n :refer :all]))

(deftest answer-test
  (is (= true (__ 11)))
  (is (= true (__ 121)))
  (is (= false (__ 123)))
  (is (= true (__ 0)))
  (is (= false (__ 88099)))
  (is (= true (__ 89098)))
  (is (= true (__ 89089)))
  (is (= (take 20 (filter __ (range)))
        [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101])))
