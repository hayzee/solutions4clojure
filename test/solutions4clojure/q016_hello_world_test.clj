(ns solutions4clojure.q016-hello-world-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q016-hello-world :refer :all]))

(deftest answer-test
  (is (= (answer "Dave") "Hello, Dave!"))
  (is (= (answer "Jenn") "Hello, Jenn!"))
  (is (= (answer "Rhea") "Hello, Rhea!")))