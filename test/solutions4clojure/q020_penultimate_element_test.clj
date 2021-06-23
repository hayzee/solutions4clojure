(ns solutions4clojure.q020-penultimate-element-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q020-penultimate-element :refer :all]))

(deftest answer-test
  (is (= (__ (list 1 2 3 4 5)) 4))
  (is (= (__ ["a" "b" "c"]) "b"))
  (is (= (__ [[1 2] [3 4]]) [1 2])))