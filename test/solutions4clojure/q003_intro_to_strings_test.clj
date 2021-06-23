(ns solutions4clojure.q003-intro-to-strings-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q003-intro-to-strings :refer :all]))

(deftest answer-test
  (is (= __ (.toUpperCase "hello world"))))