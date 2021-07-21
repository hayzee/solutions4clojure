(ns solutions4clojure.q007-vectors-conj-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q007-vectors-conj :refer :all]))

(deftest answer-test
  (is (= __ (conj [1 2 3] 4)))
  (is (= __ (conj [1 2] 3 4))))
