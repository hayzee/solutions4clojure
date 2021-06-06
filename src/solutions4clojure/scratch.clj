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


