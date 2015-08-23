;; Write a function which returns the last element in a sequence.
;; Special Restrictions last

;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; 方法1
(= (#(first (reverse %)) [1 2 3 4 5]) 5)
(= (#(first (reverse %)) '(5 4 3)) 3)
(= (#(first (reverse %)) ["b" "c" "d"]) "d")

;; 方法2
(= (#(nth % (dec (count %))) [1 2 3 4 5]) 5)
(= (#(nth % (dec (count %))) '(5 4 3)) 3)
(= (#(nth % (dec (count %))) ["b" "c" "d"]) "d")
