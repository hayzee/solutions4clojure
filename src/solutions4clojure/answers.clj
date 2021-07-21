(ns solutions4clojure.answers)

;(defmacro defanswer [sy & form]
;  `(intern *ns* '~sy '~form))

(defmacro defanswer [sy & form]
  `(def ~sy (quote ~form)))

(defmacro is [answer form]
  (let [answer-str
        (->>
          (seq (str (deref (resolve answer))))
          (drop-last 1)
          (drop 1)
          (apply str ))]
    `(~'eval (~'read-string ~(str "(clojure.test/is " (clojure.string/replace (str form) #"__" answer-str) ")")))))

