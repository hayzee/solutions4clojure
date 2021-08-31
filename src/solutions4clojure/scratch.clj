(ns solutions4clojure.scratch)

;; Incomplete
;; ==========
;;
;; 124: Analyse reversi         - https://web.archive.org/web/20200701030558/http://www.4clojure.com/problem/124
;; 127: Love triangle           - https://web.archive.org/web/20200701030613/http://www.4clojure.com/problem/127
;; 140: Veitch, Please!         - https://web.archive.org/web/20200701030704/http://www.4clojure.com/problem/140
;; 164: Language of a DFA       - https://web.archive.org/web/20200701030833/http://www.4clojure.com/problem/164



;; 124: Analyse reversi         - https://web.archive.org/web/20200701030558/http://www.4clojure.com/problem/124

(set! *print-length* 7)

(comment

  (clojure.pprint/pprint
    (mapv vec (partition 5 (range 1 30))))

  )

(def board
  [[1 2 3 4 5]
   [6 7 8 9 10]
   [11 12 13 14 15]
   [16 17 18 19 20]
   [21 22 23 24 25]])

(defn get-linevec [board [r c] [ro co]]
  (->>
    (iterate #(mapv + [ro co] %) [r c])
    (map #(hash-map :pos % :val (get-in board %)))
    (take-while :val)))

(get-linevec board [0 0] [1 1])