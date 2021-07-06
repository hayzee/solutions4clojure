(ns solutions4clojure.q121-universal-compute-engine)

(def __
  (fn unicomp [e]
    (fn [m]
      (let [lookup        (fn [e] (get (merge {'+ + '- - '* * '/ /} m) e e))
            deep-replace  (fn deep-replace [[f & r]]
                            (when f
                              (if (sequential? f)
                                (cons (deep-replace f) (deep-replace r))
                                (cons (lookup f) (deep-replace r)))))
            do-eval       (fn do-eval [[f & r]]
                            (when f
                              (cond
                                (fn? f) (apply f (do-eval r))
                                (coll? f) (cons (do-eval f) (do-eval r))
                                :else (cons f (do-eval r)))))]
        (do-eval (deep-replace e))))))
