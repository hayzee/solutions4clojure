(ns solutions4clojure.q005-lists-conj-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q005-lists-conj :refer :all]))

(deftest answer-test
  (is (= __ (conj '(2 3 4) 1)))
  (is (= __ (conj '(3 4) 2 1))))
