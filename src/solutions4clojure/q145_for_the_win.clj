(ns solutions4clojure.q145-for-the-win)

; Clojure's for macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s).
; It can take some time to understand how to use it properly, but that investment will be paid back with clear, concise
; sequence-wrangling later. With that in mind, read over these for expressions (see tests) and try to see how each of
; them produces the same result.

(def __
  [1 5 9 13 17 21 25 29 33 37])