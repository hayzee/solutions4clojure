(ns solutions4clojure.q019-last-element-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q019-last-element :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3 4 5]) 5))
  (is (= (__ '(5 4 3)) 3))
  (is (= (__ ["b" "c" "d"]) "d")))
