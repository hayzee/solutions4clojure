(ns solutions4clojure.q059-juxtaposition-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q059-juxtaposition :refer :all]))

(deftest answer-test
  (is (= [21 6 1] ((__ + max min) 2 3 5 1 6 4)))
  (is (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello")))
  (is (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))))