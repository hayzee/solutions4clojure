(ns solutions4clojure.q036-let-it-be-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q036-let-it-be :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= 10 (let __ (+ x y))))
  (answer/is __ (= 4 (let __ (+ y z))))
  (answer/is __ (= 1 (let __ z))))