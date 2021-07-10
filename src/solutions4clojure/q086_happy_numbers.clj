(ns solutions4clojure.q086-happy-numbers)

(def __
  (fn happy? [n]
    (contains?
      (loop [all-nums  (iterate (fn [n] (reduce + (map #(* % %) (map #(Character/digit ^char % 10) (seq (str n)))))) n)
             num-set   #{}]
        (if (contains? num-set (first all-nums))
          num-set
          (recur (rest all-nums) (conj num-set (first all-nums)))))
      1)))