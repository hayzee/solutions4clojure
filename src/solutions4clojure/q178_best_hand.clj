(ns solutions4clojure.q178-best-hand)

(def __
  (fn best-hand [cards]
    (let [str-to-card (fn [s ah]
                        {:suit ({\D :diamond \H :heart \C :club \S :spade} (.charAt s 0))
                         :rank ({\2 2 \3 3 \4 4 \5 5 \6 6 \7 7 \8 8 \9 9 \T 10 \J 11 \Q 12 \K 13 \A (if ah 14 1)} (.charAt s 1))})
          hh (map #(str-to-card % true) cards)
          hl (map #(str-to-card % false) cards)
          rising-seq? (fn [s]
                        (every? #{1} (map - (rest s) s)))
          straight? (fn [hh hl]
                      (or
                        (rising-seq? (sort (map :rank hh)))
                        (rising-seq? (sort (map :rank hl)))))
          flush? (fn [h]
                   (= 1 (count (distinct (sort (map :suit h))))))
          of-a-kind (fn [h]
                      (sort > (map second (frequencies (map second h)))))]
      (cond
        (and (straight? hh hl)(flush? hh)) :straight-flush
        (= (first (of-a-kind hh)) 4) :four-of-a-kind
        (= (of-a-kind hh) [3 2]) :full-house
        (flush? hh) :flush
        (straight? hh hl) :straight
        (= (first (of-a-kind hh)) 3) :three-of-a-kind
        (= (take 2 (of-a-kind hh)) [2 2]) :two-pair
        (= (first (of-a-kind hh)) 2) :pair
        :else :high-card))))