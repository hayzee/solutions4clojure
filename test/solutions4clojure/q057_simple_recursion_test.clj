(ns solutions4clojure.q057-simple-recursion-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q057-simple-recursion :refer :all]))

(deftest answer-test
  (is (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))))
