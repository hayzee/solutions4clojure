(ns solutions4clojure.q071-rearranging-code-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q071-rearranging-code :refer :all]))

(deftest answer-test
  (is (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
        (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
        5)))