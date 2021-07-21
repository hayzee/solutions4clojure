(ns solutions4clojure.q016-hello-world-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q016-hello-world :refer :all]))

(deftest answer-test
  (is (= (__ "Dave") "Hello, Dave!"))
  (is (= (__ "Jenn") "Hello, Jenn!"))
  (is (= (__ "Rhea") "Hello, Rhea!")))