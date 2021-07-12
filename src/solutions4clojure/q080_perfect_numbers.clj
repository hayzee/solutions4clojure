(ns solutions4clojure.q080-perfect-numbers)

(def __
  (fn isperfect? [n]
    (let [round?     (fn round? [n] (== n (int n)))
          divisorof? (fn [n m] (round? (/ n m)))
          divisors   (fn divisors [n] (filter #(divisorof? n %) (range 1 n)))]
      (= n (reduce + (divisors n))))))
