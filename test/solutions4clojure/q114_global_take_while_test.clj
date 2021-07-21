(ns solutions4clojure.q114-global-take-while-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q114-global-take-while :refer :all]))

(deftest answer-test
  (is (= [2 3 5 7 11 13]
        (__ 4 #(= 2 (mod % 3))
          [2 3 5 7 11 13 17 19 23])))
  (is (= ["this" "is" "a" "sentence"]
        (__ 3 #(some #{\i} %)
          ["this" "is" "a" "sentence" "i" "wrote"])))
  (is (= ["this" "is"]
        (__ 1 #{"a"}
          ["this" "is" "a" "sentence" "i" "wrote"]))))
