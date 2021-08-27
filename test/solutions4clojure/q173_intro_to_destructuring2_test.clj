(ns solutions4clojure.q173-intro-to-destructuring2-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q173-intro-to-destructuring2 :refer :all]
            [solutions4clojure.answers :as answer]))

(deftest answer-test
  (answer/is __ (= 3
                  (let [[__] [+ (range 3)]] (apply __))
                  (let [[[__] b] [[+ 1] 2]] (__ b))
                  (let [[__] [inc 2]] (__)))))