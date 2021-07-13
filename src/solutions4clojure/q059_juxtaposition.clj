(ns solutions4clojure.q059-juxtaposition)

(def __
  #(fn [& s] (for [f %&] (apply f s))))
