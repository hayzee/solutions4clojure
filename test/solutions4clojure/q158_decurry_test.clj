(ns solutions4clojure.q158-decurry-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q158-decurry :refer :all]))

(deftest answer-test
  (is (= 10 ((__ (fn [a]
                   (fn [b]
                     (fn [c]
                       (fn [d]
                         (+ a b c d))))))
             1 2 3 4)))
  (is (= 24 ((__ (fn [a]
                   (fn [b]
                     (fn [c]
                       (fn [d]
                         (* a b c d))))))
             1 2 3 4)))
  (is (= 25 ((__ (fn [a]
                   (fn [b]
                     (* a b))))
             5 5))))
