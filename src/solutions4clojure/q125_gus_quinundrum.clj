(ns solutions4clojure.q125-gus-quinundrum
  (:require [solutions4clojure.answers :refer :all]))

; Create a function of no arguments which returns a string that is an exact copy of the function itself.
; Hint: Read up on quines if you get stuck (this question is harder than it first appears); but it’s worth
; the effort to solve it independently if you can! Fun fact: Gus is the name of the 4Clojure dragon.

(defanswer __
  (fn x [] (let [[s1 s2] ["(fn x [] (let [[s1 s2] [" "]] (str s1 (char 34) s1 (char 34) (char 32) (char 34) s2 (char 34) s2)))"]] (str s1 (char 34) s1 (char 34) (char 32) (char 34) s2 (char 34) s2))))
