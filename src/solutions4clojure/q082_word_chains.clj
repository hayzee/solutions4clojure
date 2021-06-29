(ns solutions4clojure.q082-word-chains)

(def __
  (fn chainable? [s]
    (let [rot1   (fn [s] (concat (rest s) (list (first s))))
          rots   (fn [s] (take (count s) (iterate rot1 s)))
          combis (fn combis [s]
                   (if (empty? s)
                     (list(list))
                     (for [e (rots s)
                           r (combis (rest e))]
                       (cons (first  e) r))))
          edit-distance (fn [str1 str2]
                          (let [edit-distance-inner (fn edit-distance-inner [str1 str2 m n]
                                                      (if (zero? m)
                                                        n
                                                        (if (zero? n)
                                                          m
                                                          (if (= (nth str1 (- m 1)) (nth str2 (- n 1)))
                                                            (edit-distance-inner str1, str2, (dec m), (dec n))
                                                            (+ 1 (min (edit-distance-inner str1, str2, m, (dec n))
                                                                   (edit-distance-inner str1, str2, (dec m), n)
                                                                   (edit-distance-inner str1, str2, (dec m), (dec n))))))))]
                            (edit-distance-inner str1 str2 (count str1) (count str2))))
          chain? (fn [s]
                   (= (dec (count s))
                     (reduce + (map #(apply edit-distance %) (partition 2 1 s)))))]
      (not (empty? (filter chain? (combis s)))))))