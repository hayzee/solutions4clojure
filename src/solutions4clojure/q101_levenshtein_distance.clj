(ns solutions4clojure.q101-levenshtein-distance)

(def __
  #(let [lv (fn lv [str1 str2 m n]
                 (if (zero? m)
                   n
                   (if (zero? n)
                     m
                     (if (= (nth str1 (- m 1)) (nth str2 (- n 1)))
                       (lv str1, str2, (dec m), (dec n))
                       (+ 1 (min (lv str1, str2, m, (dec n))
                              (lv str1, str2, (dec m), n)
                              (lv str1, str2, (dec m), (dec n))))))))]
     (lv %1 %2 (count %1) (count %2))))