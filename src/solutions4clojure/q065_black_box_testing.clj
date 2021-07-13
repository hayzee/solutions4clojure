(ns solutions4clojure.q065-black-box-testing)

(def __
  #(cond
     (= % (conj % {})) :map
     (= (conj % 'a 'a) (conj % 'a)) :set
     (= (first (conj (empty %) 'a 'b)) 'b) :list
     :else :vector))


; Explanation:
(comment
  ; conj-ing a map to itself will result in the map.
  (conj {} {})
  ; .... not so with other collection types (set, list vector) which will also conj onto themselves, but it changes them.
  (conj #{} #{})
  (conj '() '())
  (conj '[] '[])
  ; .... as the self conj works on all types, it must be the first test.
  ; .... this eliminates maps {}.

  ; conj-ing an element twice onto a set will be the same as conj-ing the element once onto the set.
  [(conj '#{a} 'a) (conj '#{a} 'a 'a)]
  ; not so with with other collection types (list, vector) which are extended (either at head or tail) by the operation.
  [(conj '(a) 'a) (conj '(a) 'a 'a)]
  [(conj '[a] 'a) (conj '[a] 'a 'a)]
  ; .... as the element conj works on all remaining types, it must be the second test.
  ; .... this eliminates sets #{}.

  ; conj-ing 2 different elements onto an empty list will result in the element second of those two elements being at the head.
  (conj '() 1 2)
  ; it is the other way round for a vector
  (conj [] 1 2)
  )