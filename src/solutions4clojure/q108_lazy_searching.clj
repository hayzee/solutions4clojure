(ns solutions4clojure.q108-lazy-searching)

(def __
  (fn lazy-search [& seqs]
    (let [firsts (->> seqs
                   (map first)
                   (into #{}))]
      (if (= (count firsts) 1)
        (first firsts)
        (let [new-seqs (sort-by first seqs)]
          (if (empty? (first new-seqs))
            nil
            (apply lazy-search (cons (rest (first new-seqs)) (rest new-seqs)))))))))
