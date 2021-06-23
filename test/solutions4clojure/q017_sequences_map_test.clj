(ns solutions4clojure.q017-sequences-map-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q017-sequences-map :refer :all]))

(deftest answer-test
  (is (= __ (map #(+ % 5) '(1 2 3)))))