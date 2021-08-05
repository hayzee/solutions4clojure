(ns solutions4clojure.q062-reimplement-iterate-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q062-reimplement-iterate :refer :all]))

(deftest answer-test
  (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
  (is (= (take 100 (__ inc 0)) (take 100 (range))))
  (is (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))))
