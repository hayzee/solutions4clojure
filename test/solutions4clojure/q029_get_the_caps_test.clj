(ns solutions4clojure.q029-get-the-caps-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q029-get-the-caps :refer :all]))

(deftest answer-test
  (is (= (answer "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (answer "nothing")))
  (is (= (answer "$#A(*&987Zf") "AZ")))