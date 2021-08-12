(ns solutions4clojure.q099-product-digits)

(def __
  (fn [n1 n2]
    (mapv
      #(Character/digit ^char % 10)
      (seq (str (* n1 n2))))))