(ns solutions4clojure.q171-intervals)

(def __
  (fn intervals [s]
    (if (empty? s)
      s
      (let [sort-unique   (sort (distinct s))
            map-vec       (map vector sort-unique (cons (dec (first sort-unique)) sort-unique))
            [vec1  vec2]  (split-with #(= 1 (- (first %) (second %))) map-vec)
            [vec1m tail]  [(map first vec1) (into [] (map first vec2))]
            head          (into [] (if (= 1 (count vec1m)) [(first vec1m) (first vec1m)] vec1m)) ]
        (cons [(first head) (last head)] (intervals tail))))))
