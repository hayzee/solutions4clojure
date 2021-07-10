(ns solutions4clojure.q075-eulers-totient-function-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q075-eulers-totient-function :refer :all]))

(deftest answer-test
  (is (= (__ 1) 1))
  (is (= (__ 10) (count '(1 3 7 9)) 4))
  (is (= (__ 40) 16))
  (is (= (__ 99) 60)))
