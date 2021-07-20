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
                         ;(reduced [:error])  ;; not allowed on 4clojure - older version of compiler
                         (conj v :x)
                         )
                       v)))
                 [] s)))))


; Also works but not efficient
;(def __
;  (fn [pseq]
;    (->>
;      (apply str (filter #{\{ \} \( \) \[ \]} pseq))
;      (iterate #(clojure.string/replace % #"\{\}|\(\)|\[\]" ""))
;      (partition 2)
;      (drop-while (fn [[f s]] (not= f s)))
;      ffirst
;      (= ""))))


