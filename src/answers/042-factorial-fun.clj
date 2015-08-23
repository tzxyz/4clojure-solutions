;; Write a function which calculates factorials.

;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)

;; 阶乘函数，使用reduce
(defn factorial-fun
  [n]
  "Write a function which calculates factorials."
  (reduce * (range 1 (inc n))))

(= (factorial-fun 1) 1)
(= (factorial-fun 3) 6)
(= (factorial-fun 5) 120)
(= (factorial-fun 8) 40320)
