(ns solutions4clojure.q009-sets-conj-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q009-sets-conj :refer :all]))

(deftest answer-test
  (is (= #{1 2 3 4} (conj #{1 4 3} __))))