(ns solutions4clojure.q011-maps-conj-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q011-maps-conj :refer :all]))

(deftest answer-test
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} answer [:c 3]))))