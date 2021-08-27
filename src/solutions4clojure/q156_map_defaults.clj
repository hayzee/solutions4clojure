(ns solutions4clojure.q156-map-defaults)

; When retrieving values from a map, you can specify default values in case the key is not found:
;
; (= 2 (:foo {:bar 0, :baz 1} 2))
;
; However, what if you want the map itself to contain the default values? Write a function which takes a default value
; and a sequence of keys and constructs a map.

(def __
  (fn [e v]
    (reduce #(conj %1 [%2 e]) {} v)))