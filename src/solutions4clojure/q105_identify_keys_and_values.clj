(ns solutions4clojure.q105-identify-keys-and-values)

(def __
  (fn ikav [s]
    (if (empty? s)
      (hash-map)
      (let [ [keywd tail]   (split-at 1 s)
            [value recurs] (split-with (complement keyword?) tail)]
        (assoc (ikav recurs) (first keywd) (vec value))))))
