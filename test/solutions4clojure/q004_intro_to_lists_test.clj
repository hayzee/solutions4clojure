(ns solutions4clojure.q004-intro-to-lists-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q004-intro-to-lists :refer :all])
  (:require [solutions4clojure.answers :as answer]))

;(deftest answer-test
;  (is (= __ '(:a :b  :c))))
(deftest answer-test
  (answer/is __ (= (list __) '(:a :b :c))))
