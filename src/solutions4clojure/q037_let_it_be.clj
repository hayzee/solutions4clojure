(ns solutions4clojure.q037-let-it-be)

(comment

  (def answer1 (= 10 (let [x 7 y 3 z 1] (+ x y))))

(def answer2 (= 4 (let [x 7 y 3 z 1] (+ y z))))

(def answer3 (= 1 (let [x 7 y 3 z 1] z)))


(defmacro defanswer [name answer] `(intern *ns* '~name '~answer))

(defanswer answer [x 7 y 3 z 1])


  )
