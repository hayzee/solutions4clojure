(ns solutions4clojure.q064-intro-to-reduce-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q064-intro-to-reduce :refer :all]))

(deftest answer-test
  (is (= 15 (reduce __ [1 2 3 4 5])))
  (is (=  0 (reduce __ [])))
  (is (=  6 (reduce __ 1 [2 3]))))