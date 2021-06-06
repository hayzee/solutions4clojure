(ns solutions4clojure.q015-double-down-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q015-double-down :refer :all]))

(deftest answer-test
  (is (= (answer 2) 4))
  (is (= (answer 3) 6))
  (is (= (answer 11) 22))
  (is (= (answer 7) 14)))


