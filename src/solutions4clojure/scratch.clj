(ns solutions4clojure.scratch)

(comment

  (def a '(3 3 3))

  (def b '(1 2 3))

  (let [rslt (->>
               (map (fn [a b]
                        (cond (> a b) :alice
                              (< a b) :bob)) a b)
               (filter (complement nil?))
               frequencies
               )]
       [(rslt :alice 0) (rslt :bob 0)])


  (select-keys {:alice 1 :bob 2} [:alice :bob])

  (filter (complement nil?) '(:bob nil :alice))


  (let [freqs (frequencies (map (fn [a b]
                                    (cond (> a b) :alice
                                          (< a b) :bob)) a b))]
       [(freqs :alice 0) (freqs :bob 0)])


  ;;

  (def square-matrix
       [[1 2 3 4]
        [5 6 7 8]
        [9 10 11 12]
        [13 14 15 16]])

  (defn make-square-matrix
        [n]
        (->>
          (shuffle (range (* n n)))
          (partition n)))

  (def square-matrix (make-square-matrix 3))

  square-matrix

  (def primary-diagonal (map-indexed #(nth %2 %1) square-matrix))

  (def secondary-diagonal
       (let [max-idx (dec (count square-matrix))]
            (when-not (neg? max-idx)
                      (map-indexed #(nth %2 (- max-idx %1)) square-matrix))))

  (def sum-primary (reduce + primary-diagonal))

  (def sum-secondary (reduce + secondary-diagonal))

  [sum-secondary, sum-primary]

  (Math/abs (- sum-primary sum-secondary))

  ;;

  (defn diagonalDifference [arr]
        (let [primary-diagonal (map-indexed #(nth %2 %1) arr)
              secondary-diagonal (let [max-idx (dec (count arr))]
                                      (when-not (neg? max-idx)
                                                (map-indexed #(nth %2 (- max-idx %1)) arr)))
              sum-primary (reduce + primary-diagonal)
              sum-secondary (reduce + secondary-diagonal)]
             (Math/abs (- sum-primary sum-secondary))))

  (diagonalDifference (make-square-matrix 6))


  ;;

  (def arr [-4 3 -9 1 4 1 0])

  [(filter pos? arr) (filter neg? arr) (filter zero? arr)]

  [(count (filter pos? arr)) (count (filter neg? arr)) (count (filter zero? arr))]


  (defn plusMinus [arr]
        (doall (map
                 #(println (format "%.6f" (float (/ % (count arr)))))
                 [(count (filter pos? arr)) (count (filter neg? arr)) (count (filter zero? arr))]))
        nil)

  (plusMinus [1 1 0 -1 -1])



  ;; Staircase

  (defn staircase [n]
        ())

  (def n 4)

  (map #(apply str (conj (vec (repeat % "*")) "*")) (range n))


  (defn staircase [n]
        (let [fmt (str "%" n "s")]
             (doall (map println (map #(format fmt (apply str (conj (vec (repeat % "*")) "*"))) (range n)))))
        nil)

  (staircase 30)

  (repeat 2 "*")




  (defn staircase [n]
        (let [fmt (str "%" n "s")]
             (doall (map println (map #(format fmt (apply str (vec (repeat (inc %) "#")))) (range n)))))
        nil)

  (staircase 33)


  ;; Extralong fac

  (defn elf [n]
        (str (reduce *' (range 1 (inc n)))))

  (prn (elf 200))

  ;;


; Complete the miniMaxSum function below.
(defn miniMaxSum [arr]

      (let [s (sort arr)
            f4 (take 4 s)
            l4 (drop 1 s)]

      [f4 l4]
      ))

;(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))))
;
;arr

(miniMaxSum [5 4 8 2 3])


(fn flat [s]
    (if (empty? s)
        '()
        (if (coll? (first s))
            (concat (flat (first s)) (flat (rest s)))
            (cons (first s) (flat (rest s)))
            )))

(defn f [s]
      (when (seq s)
            (if (coll? (first s))
                (concat (f (first s)) (f (rest s)))
                (cons (first s) (f (rest s))))))




(myflat '((9 8) 1 (1 2 3) 2))



(defn f [s]
      (when (seq s)
            (let [fs (first s)
                  frs (f (rest s))]
                 (if (coll? fs)
                     (concat (f fs) frs)
                     (cons fs frs)))))

(f '((9 8) 1 (1 2 3) 2))

  )  ;; comment end


(defn all-pairs [sq]
  (let [isq (map-indexed #(vector %1 %2) sq)]                ;     [[1 s1] [2 s2] .... [n sn]]
    (for [[ii is] isq
          [ji js] isq
          :when (not= ii ji)]
         [is js])))   ; use the indexes to eliminate self-joins



(defn cartesian
  "Create a cartesian product of 2 sequences `si and `ji"
  [si sj]
  (for [in si
       jn sj]
    [in jn]))


(defn vrot1
  "One rotation of `s as a vector, where the first becomes last."
  [s]
  (let [v (vec s)]
  (conj (subvec v 1) (first  v))))


(defn vrots
  "All rotations of `s as a vector of vectors"
  [s]
  (->>
    (iterate vrot1 s)
    (take (count s))
    vec))

(defn combis
  "All combinations of `s as a vector of vectors"
  [s]
  (if (seq s)
    (for [rs (vrots s)
          cr (combis (rest rs))]
         (cons (first rs) (seq cr)))
    (list s)))


(->>
  (range)
  (map inc )
  (reductions *' )
  (take 100 )
  last
  str
  count
  )


(time (last (take 10000 (iterate inc 1))))

(time (last (range 1 10001)))

(defn deep-merge [a & maps]
      (if (map? a)
          (apply merge-with deep-merge a maps)
          (apply merge-with deep-merge maps)))




(comment
;; q130 tree reparenting

;;(ns solutions4clojure.q130-tree-reparenting)

;;; SOLUTION !!! ;;;

(def t
  '(d
     (b
       (c
         (x)
         (y)
         (z
           (p
             (q)
             (r))))
       (e)
       (a
         (f
           (g)
           (h))))))

(def t
  '(a
     (b)
     (c
       (d)
       (e))
     ))

(defn detach [tree node]
  (let [path (atom [])
        found (atom [nil []])
        visit (fn [n t]
                (if (seq? t)
                  (if (= (first t) n)
                    (do
                      ;                      (tap> (str "found " t " replace with nil"))
                      ;                      (when (seq @path)
                      (reset! found [t (pop @path)]);)
                      nil)
                    (do
                      ;                      (tap> (str "filter nil from " t))
                      (when (seq @path)
                        (swap! path pop))
                      (remove nil? t)))
                  (do
                    ;                    (tap> (str "keep " t))
                    (swap! path conj t)
                    t)))]
    {:remain (clojure.walk/postwalk (partial visit node) tree)   ; remainder
     :detached (first @found)     ; node
     :path (second @found)  ; path
     }))

;(defn detach2 [tree node]
;  (let [{r :remain d :detached p :path} (detach tree node)]
;    [r d p]))

(conj {:orig t} (detach t 'd))

(detach t 'd)

(detach '(a (b) (c)) 'c)
(detach '(a (b) (c)) 'z)
(detach '(h) 'h)
(detach '(h) 'z)
(detach '() 'h)

(defn detachments [tree node]
  (let [{r :remain d :detached p :path} (detach tree node)]
    (when d
      (cons d (detachments r (peek p))))))

(detachments '(a (c)) 'c)

;(defn attach [t1 t2]
(defn attach [t2 t1]
  (if (seq t1)
    (concat t1 (list t2))
    t2))

(defn reparent [node tree]
  (reduce attach (reverse (detachments tree node))))

(def __ reparent)

(= '(n)
  (__ 'n '(n)))

(= '(a (t (e)))
  (__ 'a '(t (e) (a))))

(= '(e (t (a)))
  (__ 'e '(a (t (e)))))

(= '(a (b (c)))
  (__ 'a '(c (b (a)))))

(= '(d
      (b
        (c)
        (e)
        (a
          (f
            (g)
            (h)))))
  (__ 'd '(a
            (b
              (c)
              (d)
              (e))
            (f
              (g)
              (h)))))

(= '(c
      (d)
      (e)
      (b
        (f
          (g)
          (h))
        (a
          (i
            (j
              (k)
              (l))
            (m
              (n)
              (o))))))
  (__ 'c '(a
            (b
              (c
                (d)
                (e))
              (f
                (g)
                (h)))
            (i
              (j
                (k)
                (l))
              (m
                (n)
                (o))))))


(detachments '(a (t (e))) 'e)

(reparent '(a (b) (c (d) (e))) 'e)


(defn attach [t1 t2]
  (if (seq t1)
    (concat t1 (cons (list (first t2)) (rest t2)))
    t2))


(attach '(a (z)) '(c))




;; OLD STUFF ;;





(def t
  '(d
     (b
       (c)
       (e)
       (a
         (f
           (g)
           (h))))))


;; part1 reconstruct the tree t
(defn traverse-tree [t]
  (println ":" t)
  (if (seq t)
    (if (seq? (first t))
      (cons (traverse-tree (first t)) (traverse-tree (rest t)))
      (cons (first t) (traverse-tree (rest t))))
    t))

(traverse-tree t)

(traverse-tree '(p (q)))

;; part2 detach the target g
(defn traverse-tree [tree g]
  (let [inner
        (fn traverse-tree [[tf & tr :as t]]
          (println ":" t)
          (when (seq t)              ;; notempty
            (if (seq? tf)   ;; is a tree
              (cons (traverse-tree tf) (traverse-tree tr))
              (cons tf (traverse-tree tr)))))]
    (inner tree)))

(traverse-tree t 'e)

(traverse-tree '(p (q)) 'p)


'(a
   (b
     (c
       (d)
       (e
         (f)
         (g)))))


(defn detach [[f & _ :as t] e]
  (when (not= f e)
    t))


(defn detach [s e]
  (group-by #(= (first %) e) (rest s)))


(defn detach [s e]
  (group-by #(= (first %) e) (rest s)))


(defn detach [s e]
  (let [{t true f false} (group-by #(= (first %) e) (rest s))]
    [(first t) (cons (first s) f)]))


(detach '(a
           (b
             (c))
           (d
             (e))
           (f
             (g)))
  'f)


(detach '(a
           (b)) 'b)


(defn traverse-tree [t]
  (println ":" t)
  (if (seq t)               ;; is not empty
    (if (seq? (first t))    ;; is a tree
      (cons (traverse-tree (first t)) (traverse-tree (rest t)))
      (cons (first t) (traverse-tree (rest t))))
    t))


;; THIS WORKS BUT LOSES THE POINTER TO THE detachED
(defn detach [t e]
  (when (seq t)
    (if (= (first t) e)
      ;      (list t nil)
      :nil
      (cons (first t) (remove #(= :nil %) (map #(detach % e) (rest t)))))))


(detach '(a (b) (c) (d (e) (f))) 'e)



(defn detach [t e]
  (when (seq t)
    (if (= (first t) e)
      ;      (list t nil)
      nil
      (cons (first t) (remove nil? (map #(detach % e) (rest t)))))))


(defn id1 [x]
  (println "id1 " x)
  (if (= x 'e) nil (identity x)))

;; nearly with:
(comment
  (clojure.walk/postwalk id1 '(a (b (c) (d)) (e (f) (g))))
  )
(defn id1 [x]
  (println "id1 " x)
  (if (and
        (seq? x)
        (= (first x) 'e))
    (do
      (def found x)
      nil)
    x))


;; nearly with:
(comment
  (clojure.walk/postwalk id1 '(a (b (c) (d)) (e (f) (g))))
  )
(defn id1 [e s]
  (print "id1:" s "----> ")
  (if (seq? s)
    (if (= (first s) e)
      (do
        (println "found" s " log and replace with nil")
        (reset! found s)
        nil)
      (do
        (println "filter nil from " s)
        (remove nil? s)))
    (do
      (println " keep " s)
      s)))

(do
  (def path (atom []))
  (def found (atom nil))
  (clojure.walk/postwalk (partial id1 'a) '(a (b (c) (d)) (e (f) (g))))
  )

(swap! path conj 1)
(swap! path pop)

@found

(def t
  '(d
     (b
       (c
         (x)
         (y)
         (z
           (p
             (q)
             (r))))
       (e)
       (a
         (f
           (g)
           (h))))))


(clojure.walk/postwalk (partial id1 'h) t)




;;;;;;;;;;;;;;;;;;;;;;;




;; nearly with:
(comment
  (clojure.walk/postwalk id1 '(a (b (c) (d)) (e (f) (g))))
  )
(defn id1 [e s]
  ;  (print "id1:" s "----> ")
  (if (seq? s)
    (if (= (first s) e)
      (do
        ;        (println "found" s " log and replace with nil")
        (reset! found [s (pop @path)])
        nil)
      (do
        ;        (println "filter nil from " s)
        (swap! path pop)
        (remove nil? s)))
    (do
      ;      (println " keep " s)
      (swap! path conj s)
      s)))

(do
  (def path (atom []))
  (def found (atom nil))
  ;  (clojure.walk/postwalk (partial id1 'g) '(a (b (c) (d)) (e (f) (g))))
  (clojure.walk/postwalk (partial id1 'p) t)
  )


@found
@path




(clojure.walk/postwalk (partial id1 'h) t)

  )


;; 132

(fn ib2 [p v s]
  (if (empty? (rest s))
    s
    (let [rv (map #(if (apply p %) (vector (first %) v (second %)) (vector (first %) (second %))) (partition 2 1 s))]
      (flatten (cons (first rv)(map rest (rest rv)))))))

(defn __ [p, k, sq]
  (when (seq sq)
    (cons (first sq)
      (->>
        (partition 2 1 sq)
        (map (fn [[f s :as a]] (if (p f s) [f k s] a)))
        (map (partial drop 1))
        flatten))))

(= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3]))

(= '(2) (__ > :more [2]))

(empty? (__ > :more ()))

(= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
  (take 12 (->> [0 1]
             (iterate (fn [[a b]] [b (+ a b)]))
             (map first) ; fibonacci numbers
             (__ (fn [a b] ; both even or both odd
                   (= (mod a 2) (mod b 2)))
               :same))))

(defn __ [p k s]
  (let [r (map (fn [[x y]] (if (p x y) [x k y] [x y])) (partition 2 1 s))]
    (if (seq r)
      (flatten (cons (first r) (map rest (rest r))))
      s)))

(= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3]))

(= '(2) (__ > :more [2]))

(empty? (__ > :more ()))

(= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
  (take 12 (->> [0 1]
             (iterate (fn [[a b]] [b (+ a b)]))
             (map first) ; fibonacci numbers
             (__ (fn [a b] ; both even or both odd
                   (= (mod a 2) (mod b 2)))
               :same))))
