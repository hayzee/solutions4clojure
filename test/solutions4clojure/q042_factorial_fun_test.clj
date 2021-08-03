(ns solutions4clojure.q042-factorial-fun-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q042-factorial-fun :refer :all]))

(deftest answer-test
  (is (= (__ 1) 1))
  (is (= (__ 3) 6))
  (is (= (__ 5) 120))
  (is (= (__ 8) 40320)))