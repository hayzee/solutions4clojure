(ns solutions4clojure.q014-intro-to-functions-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q014-intro-to-functions :refer :all]))

(deftest answer-test
  (is (= answer ((fn add-five [x] (+ x 5)) 3)))
  (is (= answer ((fn [x] (+ x 5)) 3)))
  (is (= answer (#(+ % 5) 3)))
  (is (= answer ((partial + 5) 3))))
