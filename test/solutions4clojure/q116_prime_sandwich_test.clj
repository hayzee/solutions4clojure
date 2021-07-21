(ns solutions4clojure.q116-prime-sandwich-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q116-prime-sandwich :refer :all]))

(deftest answer-test
  (is (= false (__ 4)))
  (is (= true (__ 563)))
  (is (= 1103 (nth (filter __ (range)) 15))))
