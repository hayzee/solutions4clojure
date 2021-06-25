(ns solutions4clojure.q101-levenshtein-distance)

(def __
  (fn edit-distance[str1 str2]
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
      (edit-distance-inner str1 str2 (count str1) (count str2)))))