;; Write a higher-order function which flips the order of the arguments of an input function.

;; (= 3 ((__ nth) 2 [1 2 3 4 5]))
;; (= true ((__ >) 7 8))
;; (= 4 ((__ quot) 2 8))
;; (= [1 2 3] ((__ take) [1 2 3 4 5] 3))

;; 思路：接受一个函数，返回一个将参数反转的函数
;; 可以将参数卸载高阶函数的返回值中
(defn flipping-out-v1
  [f]
  "Write a higher-order function which flips the order of the arguments of an input function."
  (fn [& args] (apply f (reverse args))))

(= 3 ((flipping-out-v1 nth) 2 [1 2 3 4 5]))
(= true ((flipping-out-v1 >) 7 8))
(= 4 ((flipping-out-v1 quot) 2 8))
(= [1 2 3] ((flipping-out take) [1 2 3 4 5] 3))

;; TODO不能使用partical?
(defn flipping-out-v2
  [f]
  "Write a higher-order function which flips the order of the arguments of an input function."
  (fn [& args]
    (reverse args)
    (partial f)))

(= 3 ((flipping-out-v2 nth) 2 [1 2 3 4 5]))
