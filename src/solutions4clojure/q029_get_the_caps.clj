(ns solutions4clojure.q029-get-the-caps)

(set! *warn-on-reflection* true)

(def __ (fn [s] (apply str (filter #(Character/isUpperCase ^char %) s))))

;; This is OK, but it relies on ascii encoding.
;; (def __ (fn [x] (apply str (filter #(<= 65 (int %) 90) x))))
