(ns solutions4clojure.q035-local-bindings-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q035-local-bindings :refer :all]))

(deftest answer-test
  (is (= answer (let [x 5] (+ 2 x))))
  (is (= answer (let [x 3, y 10] (- y x))))
  (is (= answer (let [x 21] (let [y 3] (/ x y))))))