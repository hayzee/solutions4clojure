(ns solutions4clojure.q137-digits-and-bases)

(def __
  (let
    [powersof (fn [b] (iterate #(* b %) 1))
     powers-lt (fn [b n] (reverse (take-while #(>= n %) (powersof b))))
     quots (fn quots [n s]
             (if (seq s)
               (let [q-fst (quot n (first s))
                     r-fst (rem n (first s))]
                 (cons q-fst (quots r-fst (rest s))))))
     digibase (fn [n b]
                (if (zero? n)
                  (list n)
                  (quots n (powers-lt b n))))]
    #(digibase %1 %2)))
