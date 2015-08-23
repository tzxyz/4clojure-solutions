;; Write a function which doubles a number.

;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

(= (#(* 2 %) 2) 4)
(= (#(* 2 %) 3) 6)
(= ((partial * 2) 22))
(= ((partial * 2) 7) 14)
