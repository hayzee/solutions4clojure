(ns solutions4clojure.q106-number-maze)

(def __
  (fn [src trg]
    (let [mv (fn
               [n]
               (filter integer? ((juxt #(* % 2) #(/ % 2) #(+ % 2)) n)))
          mvs (fn
                [n]
                (iterate #(set (flatten (map mv %))) #{n}))]
      (inc (count (take-while #(not (contains? % trg)) (take 10 (mvs src))))))))


; Previous solution (actually the same as above bu more verbose).
;(def __
;  (fn [n-source n-target]
;    (let [poss (fn
;                 ;generate all possibilities from a given integer
;                 [n]
;                 (filter integer? ((juxt #(* % 2) #(/ % 2) #(+ % 2)) n)))
;          all-poss (fn
;                     ; Generate all possibilities from a given set of integers - return a single set of integers
;                     ; This is effectively a breadth first solver
;                     [n]
;                     (iterate #(set (flatten (map poss %))) #{n}))
;          ]
;      (inc (count (take-while #(not (contains? % n-target)) (take 10 (all-poss n-source))))))))