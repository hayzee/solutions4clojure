(ns solutions4clojure.q102-into-camel-case)

(def __
  (fn [s]
    (apply str (remove #(= % \-) (map #(if (= %2 \-) (Character/toUpperCase ^char %1) %1) s (cons \x s))))))


; Other working solutions
;
;(def __
;  (fn [w]
;    (let [words (clojure.string/split w #"-")
;          initcap #(apply str (cons (Character/toUpperCase ^char (first %)) (rest %)))]
;      (apply str (cons (first words) (map initcap (rest words)))))))
;
;
;(def __
;  (fn [s]
;    (let [thelist (clojure.string/split s #"-")]
;      (clojure.string/join
;        (cons
;          (first thelist)
;          (for [s (rest thelist)]
;            (apply str (cons (.toUpperCase (str (first s))) (rest s)))))))))
;
;
;(def __
;  (fn [st]
;    (->>
;      (partition 2 1 (cons \~ st))
;      (reduce (fn [a [f s]] (conj a (case f \- (Character/toUpperCase ^char s) s))) [])
;      (remove #(= % \-))
;      (apply str ))))
;
