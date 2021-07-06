(ns solutions4clojure.q177-balancing-brackets)

(def __
  (fn [s]
    (nil? (seq (reduce
                 (fn [v c]
                   (if (some #{c} #{\( \[ \{})
                     (conj v c)
                     (if (some #{c} #{\) \] \}})
                       (if (= ({\) \( \} \{ \] \[} c) (peek v))
                         (vec (butlast v))
                         ;                         (reduced [:error])  ;; not allowed on 4clojure - older version of compiler
                         (conj v :error)
                         )
                       v)))
                 [] s)))))

;; previous answer
;(def __
;  (fn balanced? [s]
;    (let [ remove-pairs (fn remove-pairs [s]
;                          (if (empty? s)
;                            s
;                            (if (contains? #{ [\{ \}] [\[\]] [\(\)] } (take 2 s))
;                              (remove-pairs (rest (rest s)))
;                              (cons (first s) (remove-pairs (rest s))))))
;          split-at-repeat (fn [s]
;                            (->>
;                              (partition-all 2 1 s)
;                              (split-with #(apply not= %) )
;                              (map #(map first %))))]
;      (->>
;        (filter #(contains? #{ \[ \] \{ \} \( \) } %) s)
;        (iterate #(apply str (remove-pairs %)))
;        (split-at-repeat)
;        (second)
;        (first)
;        (empty?)))))


