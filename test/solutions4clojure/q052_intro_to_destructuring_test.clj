(ns solutions4clojure.q052-intro-to-destructuring-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q052-intro-to-destructuring :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= [2 4] (let [[a b c d e] [0 1 2 3 4]] __))))