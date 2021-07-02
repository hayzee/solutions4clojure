(ns solutions4clojure.q195-parentheses-again)

(def __
  (fn parensagain [limit]
    (let [state [0 ""]
          lim (* 2 limit)
          solver (fn [state generator solved?]
                   (let [solve-state (fn find-fut-states [state]
                                       (let [fut-states (for [gen-state (generator state)
                                                              fut-state (find-fut-states gen-state)] fut-state)]
                                         (if (solved? state)
                                           (cons state fut-states)
                                           fut-states)))]
                     (solve-state state)))
          generator (fn [[bal st]]
                      (when (< (count st) lim)
                        (if (zero? bal)
                          [[(inc bal) (str st "(")]]
                          [[(dec bal) (str st ")")] [(inc bal) (str st "(")]]
                          )))
          solved? (fn [[bal st]]
                    (and
                      (zero? bal)
                      (= (count st) lim)
                      ))
          ]
      (set (map second (solver state generator solved?))))))


; Also works - but slightly slower
;
; Can check with: (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))")
;
; (defn __ [n]
;  (let [solver (fn solver
;                 [st tg? term? f-mv f-apmv]
;                 (cond
;                   (tg? st)    (list st)            ;; target case
;                   (term? st)  (list)               ;; terminating case
;                   :else (for [mv (f-mv st)         ;; recursive case
;                               ns (solver (f-apmv st mv) tg? term? f-mv f-apmv)]
;                           ns)))
;        ]
;  (->>
;    (solver
;      {:o 0 :c 0 :s []}            ; state
;      #(= n (:o %) (:c %))         ; found
;      #(= (* 2 n) (count (:s %)))  ; term
;      (fn [s] (if (> (:o s) (:c s)) (list \( \)) (list \()))
;      (fn [s mv] (->
;                   s
;                   (update :o (if (= \( mv) inc identity))
;                   (update :c (if (= \) mv) inc identity))
;                   (update :s #(conj % mv))
;                   )))
;    (map :s)
;    (map #(apply str %))
;    set)))
