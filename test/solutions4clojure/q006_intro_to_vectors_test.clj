(ns solutions4clojure.q006-intro-to-vectors-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q006-intro-to-vectors :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))