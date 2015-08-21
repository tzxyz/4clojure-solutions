;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.

;; (= (__ 1 1) [1])
;; (= (__ 99 9) [8 9 1])
;; (= (__ 999 99) [9 8 9 0 1])

(defn product-digits
  [x y]
  "Write a function which multiplies two numbers and returns the result as a sequence of its digits."
  (mapv #(Integer/valueOf (str %)) (str (* x y))))

(product-digits 1 1)
(product-digits 99 9)
(product-digits 999 99)
