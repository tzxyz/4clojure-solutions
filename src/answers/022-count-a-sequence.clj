;; Write a function which returns the total number of elements in a sequence.
;; Special Restrictions count

;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)

;; 0 做为reduce的初始值，每一个值x递增1
(= (#(reduce (fn [x y] (inc x)) 0 %) '(1 2 3 3 1)) 5)
(= (#(reduce (fn [x y] (inc x)) 0 %) "Hello World") 11)
(= (#(reduce (fn [x y] (inc x)) 0 %) [[1 2] [3 4] [5 6]]) 3)
(= (#(reduce (fn [x y] (inc x)) 0 %) '(13)) 1)
(= (#(reduce (fn [x y] (inc x)) 0 %) '(:a :b :c)) 3)
