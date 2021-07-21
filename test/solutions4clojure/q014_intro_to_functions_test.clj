(ns solutions4clojure.q014-intro-to-functions-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q014-intro-to-functions :refer :all]))

(deftest answer-test
  (is (= __ ((fn add-five [x] (+ x 5)) 3)))
  (is (= __ ((fn [x] (+ x 5)) 3)))
  (is (= __ (#(+ % 5) 3)))
  (is (= __ ((partial + 5) 3))))
