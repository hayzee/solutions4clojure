(ns solutions4clojure.q002-simple-math-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q002-simple-math :refer :all]))

(deftest answer-test
  (is (= (- 10 (* 2 3)) answer)))