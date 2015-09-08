;; Given two integers, write a function which returns the greatest common divisor.

;; (= (__ 2 4) 2)
;; (= (__ 10 5) 5)
;; (= (__ 5 7) 1)
;; (= (__ 1023 858) 33)

(defn greatest-common-divisor
  [x y]
  "Given two integers, write a function which returns the greatest common divisor."
  (loop [a x b y]
    (if (= 0 (mod a b))
        b
        (recur b (mod a b)))))

(= (greatest-common-divisor 2 4) 2)
(= (greatest-common-divisor 10 5) 5)
(= (greatest-common-divisor 5 7) 1)
(= (greatest-common-divisor 1023 858) 33)
