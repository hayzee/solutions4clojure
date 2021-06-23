(ns solutions4clojure.q125-gus-quinundrum
  (:require [solutions4clojure.answers :refer :all]))

(defanswer __
  (fn x [] (let [[s1 s2] ["(fn x [] (let [[s1 s2] [" "]] (str s1 (char 34) s1 (char 34) (char 32) (char 34) s2 (char 34) s2)))"]] (str s1 (char 34) s1 (char 34) (char 32) (char 34) s2 (char 34) s2))))
