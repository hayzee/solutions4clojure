(ns solutions4clojure.q020-penultimate-element-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q020-penultimate-element :refer :all]))

(deftest answer-test
  (is (= (answer (list 1 2 3 4 5)) 4))
  (is (= (answer ["a" "b" "c"]) "b"))
  (is (= (answer [[1 2] [3 4]]) [1 2])))