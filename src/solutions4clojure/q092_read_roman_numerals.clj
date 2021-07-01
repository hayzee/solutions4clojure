(ns solutions4clojure.q092-read-roman-numerals)

(def __
  (fn rn [s]
    (let [syms {\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000}
          sub-syms {(seq "IV") 4 (seq "IX") 9 (seq "XL") 40 (seq "XC") 90 (seq "CD") 400 (seq "CM") 900}]
      (if (empty? s)
        0
        (let [next-sub-sym-token-value (get sub-syms (take 2 s))]
          (if next-sub-sym-token-value
            (+ next-sub-sym-token-value (rn (rest (rest s))))
            (+ (get syms  (first s)) (rn (rest s)))))))))