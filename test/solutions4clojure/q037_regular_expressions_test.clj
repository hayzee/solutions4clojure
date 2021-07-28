(ns solutions4clojure.q037-regular-expressions-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q037-regular-expressions :refer :all]))

(deftest answer-test
  (is (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))