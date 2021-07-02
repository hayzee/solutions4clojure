(ns solutions4clojure.q168-infinite-matrix)

(def __
  (fn mtx [& args]
    (let [lazy-iter (fn [f n]
                      (let [lazy-iter-inner (fn lazy-iter-inner [n]
                                              (let [fapp (f n)]
                                                (lazy-seq (cons fapp (lazy-iter-inner fapp)))))]
                        (lazy-seq (cons n (lazy-iter-inner n)))))
          gen-row (fn [row f] (lazy-seq (map #(f row %) (lazy-iter inc 0))))
          mtx1 (fn [f] (->>
                         (lazy-iter inc 0)
                         (map #(gen-row % f))))
          my-drop (fn my-drop [n s]
                    (if (pos? n)
                      (recur (dec n) (rest s))
                      s))
          mtx3 (fn [f m n] (->>
                             (lazy-iter inc 0)
                             (my-drop m )
                             (map #(my-drop n (gen-row % f)))))
          mtx5 (fn [f m n s t]
                 (->>
                   (lazy-iter inc 0)
                   (my-drop m)
                   (take s)
                   (map #(take t (my-drop n (gen-row % f))))))
          ]
      (case (count args)
        1 (apply mtx1 args)
        3 (apply mtx3 args)
        5 (apply mtx5 args)))))