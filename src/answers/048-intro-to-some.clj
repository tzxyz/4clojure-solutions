;; The some function takes a predicate function and a collection.
;; It returns the first logical true value of (predicate x) where x is an item in the collection.

;; (= __ (some #{2 7 6} [5 6 7 8]))
;; (= __ (some #(when (even? %) %) [5 6 7 8]))

;; some找到一个就返回
;; 找到第一个存在于set中的元素6，返回
(= 6 (some #{2 7 6} [5 6 7 8]))

;; 找到第一个偶数，返回
(= 6 (some #(when (even? %) %) [5 6 7 8]))

