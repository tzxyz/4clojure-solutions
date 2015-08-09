;; Write a function which creates a list of all integers in a given range.

;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))

;; (iterate f x) 返回的是(x, f(x), f(f(x)), f(f(f(x))))的序列

(defn implement-range
  [start end]
  "Write a function which creates a list of all integers in a given range."
  (take (- end start) (iterate inc start)))
