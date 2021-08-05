(ns solutions4clojure.q045-intro-to-iterate-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q045-intro-to-iterate :refer :all]))

(deftest answer-test
  (is (= __ (take 5 (iterate #(+ 3 %) 1)))))
