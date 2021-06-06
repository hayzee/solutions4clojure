(ns solutions4clojure.q025-find-the-odd-numbers-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q025-find-the-odd-numbers :refer :all]))

(deftest answer-test
  (is (= (answer #{1 2 3 4 5}) '(1 3 5)))
  (is (= (answer [4 2 1 6]) '(1)))
  (is (= (answer [2 2 4 6]) '()))
  (is (= (answer [1 1 1 3]) '(1 1 1 3))))