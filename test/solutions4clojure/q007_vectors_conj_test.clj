(ns solutions4clojure.q007-vectors-conj-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q007-vectors-conj :refer :all]))

(deftest answer-test
  (is (= answer (conj [1 2 3] 4)))
  (is (= answer (conj [1 2] 3 4))))
