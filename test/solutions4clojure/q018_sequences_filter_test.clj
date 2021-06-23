(ns solutions4clojure.q018-sequences-filter-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q018-sequences-filter :refer :all]))

(deftest answer-test
  (is (= __ (filter #(> % 5) '(3 4 5 6 7)))))