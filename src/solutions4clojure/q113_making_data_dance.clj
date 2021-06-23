(ns solutions4clojure.q113-making-data-dance)

(def __
  (fn [& args]
    (reify clojure.lang.Seqable
      (toString [this] (apply str (interpose ", " (sort args))))
      (seq [this] (seq (distinct args))))))

