(ns solutions4clojure.q029-get-the-caps-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q029-get-the-caps :refer :all]))

(deftest answer-test
  (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (__ "nothing")))
  (is (= (__ "$#A(*&987Zf") "AZ")))