(ns solutions4clojure.q099-product-digits)

; Difficulty: Easy
; Topics:     math seqs
;
; Write a function which multiplies two numbers and returns the result as a sequence of its digits.

(def __
  (fn [n1 n2]
    (mapv
      #(Character/digit ^char % 10)
      (seq (str (* n1 n2))))))