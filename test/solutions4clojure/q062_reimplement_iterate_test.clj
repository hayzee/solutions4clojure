(ns solutions4clojure.q062-reimplement-iterate-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q062-reimplement-iterate :refer :all]))

(deftest answer-test
  (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
  (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
  (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])))
