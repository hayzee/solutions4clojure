(ns solutions4clojure.q147-pascals-trapezoid)

; Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each
; next one is constructed from the previous following the rules used in Pascal's Triangle. For example, for [3 1 2], the
; next row is [3 4 3 2]. Beware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an arithmetic
; operator like + and the result is too large to fit into a 64-bit integer, an exception is thrown. You can use +' to
; indicate that you would rather overflow into Clojure's slower, arbitrary-precision bigint.

(def __
  (fn [start-line]
    (let [next-pascal
          (fn np [r]
            (concat (cons (first r) (map #(apply +' %) (partition 2 1 r))) (list (last r))))]
      (iterate next-pascal start-line))))