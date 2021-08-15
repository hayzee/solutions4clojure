(ns solutions4clojure.q134-a-nil-key-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q134-a-nil-key :refer :all]))

(deftest answer-test
  (is (true?  (__ :a {:a nil :b 2})))
  (is (false? (__ :b {:a nil :b 2})))
  (is (false? (__ :c {:a nil :b 2}))))