;; Write a function which returns the first x
;; number of prime numbers.

;; (= (__ 2) [2 3])
;; (= (__ 5) [2 3 5 7 11])
;; (= (last (__ 100)) 541)

;; 思路：letfn绑定一个函数表示是否是素数，如果是素数 n模于2~n之间的数都不能为0
(defn prime-numbers
  [n]
  (letfn [(prime?
           [n]
           (nil?
             (some #(zero? (mod n %)) (range 2 n))))]
    (take n (filter prime? (range 2 Long/MAX_VALUE)))))

(= (prime-numbers 2) [2 3])
(= (prime-numbers 5) [2 3 5 7 11])
(= (last (prime-numbers 100)) 541)
