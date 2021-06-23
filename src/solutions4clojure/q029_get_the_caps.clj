(ns solutions4clojure.q029-get-the-caps)

(def __ (fn [x] (apply str (filter #(<= 65 (int %) 90) x))))