(ns solutions4clojure.q125-gus-quinundrum-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q125-gus-quinundrum :refer :all])
  (:require [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= (str '__) (__))))
