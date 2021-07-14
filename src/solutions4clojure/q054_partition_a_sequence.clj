(ns solutions4clojure.q054-partition-a-sequence)

(def __
  (fn f [n s]
    (when (>= (count s) n)
      (cons (take n s) (f n (drop n s))))))

; Also works:
; (def __
;   (fn f [n s]
;     (let [[h t] (split-at n s)]
;       (when (>= (count h) 3)
;         (cons h (f n t))))))
