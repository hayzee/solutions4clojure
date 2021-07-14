(ns solutions4clojure.q058-function-composition-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q058-function-composition :refer :all]))

(deftest answer-test
  (is (= [3 2 1] ((__ rest reverse) [1 2 3 4])))
  (is (= 5 ((__ (partial + 3) second) [1 2 3 4])))
  (is (= true ((__ zero? #(mod % 8) +) 3 5 7 9)))
  (is (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))))
