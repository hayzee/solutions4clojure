(ns solutions4clojure.q166-comparisons)

; Difficulty: Easy
;
; For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >) from
; a single operation (any operator but = or ≠ will work). Write a function that takes three arguments, a less than
; operator for the data and two items to compare. The function should return a keyword describing the relationship
; between the two items.
;
; The keywords for the relationship between x and y are as follows:

; x = y → :eq
; x > y → :gt
; x < y → :lt

(def __
  (fn comparisons [lto a1 a2]
    (let [rslt [(lto a1 a2)
                (lto a2 a1)]]
      (case rslt
        [false false] :eq
        [true false] :lt
        [false true] :gt))))