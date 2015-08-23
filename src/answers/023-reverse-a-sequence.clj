;; Write a function which reverses a sequence.
;; Special Restrictions reverse rseq

;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; (into to from)的顺序取决于to的类型
(= (#(into '() %) [1 2 3 4 5]) [5 4 3 2 1])
(= (#(into '() %) (sorted-set 5 7 2 7)) '(7 5 2))
(= (#(into '() %) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
