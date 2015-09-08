;; The ->> macro threads an expression x through a variable number of forms.
;; First, x is inserted as the last item in the first form, making a list of it if it is not a list already.
;; Then the first form is inserted as the last item in the second form, making a list of that form if necessary.
;; This process continues for all the forms. Using ->> can sometimes make your code more readable.

;; (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
;;    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
;;    11)

;; ->> thread-last宏将上一个form求值(?)传递给下一个form的最后一个参数
;; (__) 中填(reduce +) 在第一个空格报错
;; 原因第一个表达式是非threading式的函数

(= 11
   (->> [2 5 4 1 3 6]
     (drop 2)
     (take 3)
     (map inc)
     ((fn [args] (reduce + args)))))
