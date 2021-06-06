(ns solutions4clojure.q006-intro-to-vectors-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q006-intro-to-vectors :refer :all]))

(deftest answer-test
  (is (= answer (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))