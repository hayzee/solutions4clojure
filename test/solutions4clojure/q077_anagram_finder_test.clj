(ns solutions4clojure.q077-anagram-finder-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q077-anagram-finder :refer :all]))

(deftest answer-test
  (is (= (__ ["meat" "mat" "team" "mate" "eat"])
        #{#{"meat" "team" "mate"}}))
  (is (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
        #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})))
