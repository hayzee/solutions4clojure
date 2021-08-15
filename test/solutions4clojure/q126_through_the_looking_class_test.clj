(ns solutions4clojure.q126-through-the-looking-class-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q126-through-the-looking-class :refer :all]))

(deftest answer-test
  (is (let [x __]
    (and (= (class x) x) x))))
