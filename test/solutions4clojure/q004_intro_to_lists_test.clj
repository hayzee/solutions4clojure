(ns solutions4clojure.q004-intro-to-lists-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q004-intro-to-lists :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= (list __) '(:a :b :c))))
