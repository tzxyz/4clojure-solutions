;; Write a function which takes a variable number of parameters and returns the maximum value.
;; Special Restrictionsmax max-key

;; (= (__ 1 8 3 4) 8)
;; (= (__ 30 20) 30)
;; (= (__ 45 67 11) 67)

(defn maximum-value
  [& coll]
  "Write a function which takes a variable number of parameters and returns the maximum value."
  (reduce (fn [x y] (if (> x y) x y)) coll))

(= (maximum-value 1 8 3 4) 8)
(= (maximum-value 30 20) 30)
(= (maximum-value 45 67 11) 67)
