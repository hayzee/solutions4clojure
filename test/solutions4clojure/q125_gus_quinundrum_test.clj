(ns solutions4clojure.q125-gus-quinundrum-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q125-gus-quinundrum :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= (str '__) (__))))
