;; Write a function which returns the first X fibonacci numbers.

;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))

(defn fibonacci-sequence
  [numbers]
  "Write a function which returns the first X fibonacci numbers."
  (take numbers (map last (iterate (fn [[x y]] [y (+ x y)]) [0 1]))))

(fibonacci-sequence 3)
(fibonacci-sequence 6)
(fibonacci-sequence 8)
