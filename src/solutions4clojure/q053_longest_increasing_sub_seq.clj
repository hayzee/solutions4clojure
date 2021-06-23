(ns solutions4clojure.q053-longest-increasing-sub-seq)

(def __
  (fn [s]
    (let [rising? (fn [[f s]] (= s (inc f)))
          departition (fn [s] (concat (first s) (map second (rest s))))]
      (->>
        (partition 2 1 s)
        (partition-by rising?)
        (filter #(seq %))
        (filter #(rising? (first %)))
        (sort-by count >)
        first
        departition))))

; previous attempt (also works)
;
;(fn [s]
;  (let
;    [a (fn [s]
;         (loop
;           [[f & r :as s] s
;            c []
;            z []]
;           (if (seq s)
;             (if (or (empty? c) (= (inc (peek c)) f))
;               (recur r (conj c f) z)
;               (recur r [f] (conj z c)))
;             (if (seq c)
;               (conj z c)
;               z))))
;     t (first (sort-by count > (filter #(seq (rest %)) (a s))))]
;    (or t [])))
