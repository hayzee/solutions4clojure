(ns solutions4clojure.q104-write-roman-numerals)

(def __
  (fn wn [n]
    (let [looper (fn looper [n syms]
                   (if (empty? syms)
                     (list)
                     (let [[sym divisor] (first syms)
                           [qt  remainr] ((juxt quot rem) n divisor)]
                       (cons (repeat qt sym) (looper remainr (rest syms))))))]
      (apply str (flatten (looper n (list [\M 1000] ['(\C \M) 900] [\D 500] ['(\C \D) 400] [\C 100] ['(\X \C) 90] [\L 50] ['(\X \L) 40] [\X 10] ['(\I \X) 9] [\V 5] ['(\I \V) 4] [\I 1])))))))
