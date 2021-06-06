(ns solutions4clojure.q005-lists-conj-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q005-lists-conj :refer :all]))

(deftest answer-test
  (is (= answer (conj '(2 3 4) 1)))
  (is (= answer (conj '(3 4) 2 1))))
