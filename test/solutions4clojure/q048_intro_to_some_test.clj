(ns solutions4clojure.q048-intro-to-some-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q048-intro-to-some :refer :all]))

(deftest answer-test
  (is (= __ (some #{2 7 6} [5 6 7 8])))
  (is (= __ (some #(when (even? %) %) [5 6 7 8]))))