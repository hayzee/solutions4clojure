(ns solutions4clojure.q148-the-big-divide)

; Write a function which calculates the sum of all natural numbers under n (first argument) which are evenly divisible
; by at least one of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes. Note: Some test
; cases have a very large n, so the most obvious solution will exceed the time limit.

(def __
  (fn [n a b]
    (let [f #(quot (dec n) %)
          g #(/ (*' % (f %) (inc (f %))) 2)]
      (- (+ (g a) (g b)) (g (* a b))))))
