(ns solutions4clojure.elementary)

(comment


  ;; 1. Nothing but the truth
  (= true true)

  ;; 2. Simple math (= (- 10 (* 2 3)) __)
  4

  ;; 3. Intro to Strings
  "HELLO WORLD"

  ;; 4. Intro to Lists
  :a :b :c

  ;; 5. Lists: conj
  (list 1 2 3 4)

  ;; 6. Intro to Vectors
  :a :b :c

  ;; 7. Vectors: conj
  '(1 2 3 4)

  ;; 8. Intro to Sets
  #{:a :b :c :d}

  ;; 9. Sets: conj
  2

  ;; 10. Intro to Maps
  20

  ;; 11. Maps: conj
  [:b 2]

  ;; 12. Intro to Sequences
  3

  ;; 13. Sequences: rest
  '(20 30 40)

  ;; 14. Intro to Functions
  8

  ;; 15. Double Down
  #(+ % %)

  ;; 16. Hello World
  #(str "Hello, " % "!")

  ;; 17. Sequences: map
  '(6 7 8)

  ;; 18. Sequences: filter
  '(6 7)

  ;; 19. Last Element
  #(peek (vec %))

  ;; 20. Penultimate Element
  #(second (reverse %))

  ;; 21. Nth Element
  #(first (drop %2 %1))

  ;; 22. Count a Sequence
  #(reduce (fn [a _] (inc a)) 0 %)

  ;; 23. Reverse a Sequence
  (fn [s] (reduce #(cons %2 %1) '() s))

  ;; 24. Sum It All Up
  #(apply + %)

  ;; 25. Find the odd numbers
  #(filter odd? %)

  ;; 26. Fibonacci Sequence
  #(take % (map first (iterate (fn [[x y]] [y (+ y x)]) [1 1])))

  ;; 27. Palindrome Detector
  #(= (seq %) (reverse %))

  ;; 28. Flatten a Sequence
  (fn f [[h & t :as s]]
    (when (seq s)
      (if (coll? h)
        (concat (f h) (f t))
        (cons h (f t)))))

  ;; 29. Get the Caps
  (fn [x] (apply str (filter #(<= 65 (int %) 90) x)))

  ;; 30. Compress a Sequence
  #(reduce (fn [a e] (if (= e (last a)) a (conj a e))) [] (vec %))

  ;; 31. Pack a Sequence
  #(partition-by identity %)

  ;; 32. Duplicate a Sequence
  #(mapcat vector % %)

  ;; 33. Replicate a Sequence
  #(apply mapcat vector (repeat %2 %1))

  ;; 34. Implement range
  (fn [n m] (take-while #(< % m) (iterate inc n)))

  ;; 35. Local bindings
  7

  ;; 36. Let it Be
  [x 7 y 3 z 1]

  ;; 37. Regular Expressions
  "ABC"

  ;; 38. Maximum value
  #(last (sort < %&))

  ;; 39. Interleave Two Seqs
  #(mapcat vector %1 %2)

  ;; 40. Interpose a Seq
  #(drop 1 (mapcat vector (repeat %1) %2))

  ;; 41. Drop Every Nth Item
  #(mapcat rest (partition-all %2 (cons -1 %1)))

  ;; 42. Factorial Fun
  #(apply * (range 1 (inc %)))

  ;; 43. Reverse Interleave
  #(apply map vector (partition %2 %1))

  ;; 44. Rotate Sequence
  #(let [c (count %2)] (take c (drop (if (neg? %1) (+ c (rem %1 c)) %1) (cycle %2))))

  ;; 45. Intro to Iterate
  [1 4 7 10 13]

  ;; 46. Flipping out
  (fn [x] #(x %2 %1))

  ;; 47. Contain Yourself
  4

  ;; 48. Intro to some
  6

  ;; 49. Split a sequence
  #(cons (take %1 %2) (list (drop %1 %2)))

  ;; 50. Split by Type
  #(map second (group-by type %))

  ;; 51. Advanced Destructuring
  [1 2 3 4 5]

  ;; 52. Intro to Destructuring
  [c e]

  ;; 53. Longest Increasing Sub-Seq
  (fn [s]
    (let
      [a (fn [s]
           (loop
             [[f & r :as s] s
              c []
              z []]
             (if (seq s)
               (if (or (empty? c) (= (inc (peek c)) f))
                 (recur r (conj c f) z)
                 (recur r [f] (conj z c)))
               (if (seq c)
                 (conj z c)
                 z))))
       t (first (sort-by count > (filter #(seq (rest %)) (a s))))]
      (or t [])))

  ;; 54. Partition a Sequence
  (fn f [n s] (when (>= (count s) n) (cons (take n s) (f n (drop n s)))))

  ;; 55. Count Occurrences
  (fn [s] (reduce #(update-in %1 [%2] (fnil inc 0)) {} s))

  ;; 56. Find Distinct Items
  #(reduce (fn [a e] (if (some #{e} a) a (conj a e))) [] %1)

  ;; 57. Simple Recursion
  '(5 4 3 2 1)

  ;; 58. Function Composition
  (fn c
    ([f1] f1)
    ([f1 f2] (fn [& a] (f1 (apply f2 a))))
    ([f1 f2 & m] (apply c (cons (c f1 f2) m))))

  ;; 59. Juxtaposition
  #(fn [& s] (for [f %&] (apply f s)))

  ;; 60. Sequence Reductions
  (fn r
    ([f a s]
     (if (empty? s)
       (list a)
       (lazy-seq (cons a (r f (f a (first s)) (rest s))))))
    ([f s]
     (r f (first s) (rest s))))

  ;; 61. Map Construction
  #(into {} (map vector %1 %2))

  ;; 62. Re-implement Iterate
  (fn a [f i] (lazy-seq (cons i (a f (f i)))))

  ;; 63. Group a sequence
  (fn g [f s] (reduce (fn [a e] (update-in a [(f e)] (fnil #(conj % e) []))) {} s))

  ;; 64. Intro to Reduce

  ;; 65. Black Box Testing
  #(cond
     (= % (conj % {})) :map
     (= (conj % 'a 'a) (conj % 'a)) :set
     (= (first (conj % 'a 'b)) 'b) :list
     :else :vector)

  ;; 66. Greatest Common Divisor
  #(if (= %2 0) %1 (recur %2 (mod %1 %2)))

  ;; 67. Prime Numbers
  #(take % (filter (fn [p] (not-any? (fn [n] (zero? (mod p n))) (range 2 p))) (drop 2 (range))))

  ;; 68. Recurring Theme
  [7 6 5 4 3]

  ;; 69. Merge with a Function

  ; best
  #(reduce (fn [a [k v]]
             (conj a [k (if (a k) (%1 (a k) v) v)]))
     %2
     (for [x %&, y x] y))

  ; clearer
  (fn [f & m]
    (reduce #(reduce
               (fn [m [k v]]
                 (conj m
                   (if (m k)
                     [k (f (m k) v)]
                     [k v]))) %1 %2)
      m))

  ; also good
  #(reduce
     (fn [m [k v]]
       (update-in m [k] (fn [c] (if c (% c v) v))))
     {}
     (apply concat %&))

  ;; 70. Word Sorting
  (fn ws [s]
    (sort-by clojure.string/lower-case (map #(apply str (filter (fn [c] (Character/isLetter c)) %)) (clojure.string/split s #" "))))

  )