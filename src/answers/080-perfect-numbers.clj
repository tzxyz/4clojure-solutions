;; A number is "perfect" if the sum of its divisors equal the number itself.
;; 6 is a perfect number because 1+2+3=6.
;; Write a function which returns true for perfect numbers and false otherwise.

;; (= (__ 6) true)
;; (= (__ 7) false)
;; (= (__ 496) true)
;; (= (__ 500) false)
;; (= (__ 8128) true)

;; 思路：先构造perfect-numbers的序列，然后判断n是否在序列中，注意(range n)如果没有限定的活，some会一直查找下去造成死循环
(defn perfect-numbers
  [n]
  (if
    (some #{n} (reductions + (range n)))
    true
    false))

(= (perfect-numbers 6) true)
(= (perfect-numbers 7) false)
(= (perfect-numbers 496) true)
(= (perfect-numbers 500) false)
(= (perfect-numbers 8128) true)
