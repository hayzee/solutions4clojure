(ns solutions4clojure.q044-rotate-sequence)

(def __
  #(let [c (count %2)] (take c (drop (if (neg? %1) (+ c (rem %1 c)) %1) (cycle %2)))))
