(ns clj-presentation.core)


;; Start with an outline

;; intro of me
;; intro of Clojure
;; rationale
;; data
;; lisp
;; syntax
;; repl driven development
;; testing
;; logging
;; deployment
;; official hosts
;; java interop
;; unofficial hosts
;; unique libraries

(defn my-sum
  ([v] (my-sum v 0))

  ([v acc]
   (if (empty? v)
     acc
     (my-sum (rest v) (+ acc (first v))))))

(my-sum [1 2 3 4])
;; => 10
(my-sum (range 9999)) ;;overflow

(defn my-sum-recur
  ([v] (my-sum-recur v 0))

  ([v acc]
   (if (empty? v)
     acc
     (recur (rest v) (+ acc (first v)))))
  )

(my-sum-recur (range 9999))

(reduce + 0 [1 2 3 4])
;; => 10
(reductions + 0 [1 2 3 4])
;; => (0 1 3 6 10)
