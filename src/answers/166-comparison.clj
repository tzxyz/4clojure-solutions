;; For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any operator but = or ≠ will work).
;; Write a function that takes three arguments, a less than operator for the data and two items to compare.
;; The function should return a keyword describing the relationship between the two items.
;; The keywords for the relationship between x and y are as follows:
;; x = y → :eq
;; x > y → :gt
;; x < y → :lt

;; (= :gt (__ < 5 1))
;; (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum"))
;; (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))
;; (= :gt (__ > 0 2))

(defn comparison
  [op x y]
  (cond (op x y) :lt
        (op y x) :gt
        :else :eq))

(= :gt (comparison < 5 1))
(= :eq (comparison (fn [x y] (< (count x) (count y))) "pear" "plum"))
(= :lt (comparison (fn [x y] (< (mod x 5) (mod y 5))) 21 3))
(= :gt (comparison > 0 2))



