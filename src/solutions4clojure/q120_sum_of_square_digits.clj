(ns solutions4clojure.q120-sum-of-square-digits)

; Write a function which takes a collection of integers as an argument. Return
; the count of how many elements are smaller than the sum of their squared
; component digits. For example: 10 is larger than 1 squared plus 0 squared;
; whereas 15 is smaller than 1 squared plus 5 squared.

(def __
  (fn [s]
    (->>
      s
      (map (comp seq str))
      (map #(map (fn [c] (Character/digit ^char c 10)) %))
      (map (fn [s] (reduce (fn [a e] (+ a (* e e))) 0 s)))
      (map vector s)
      (filter #(apply < %))
      count)))