;; Write a function which reverses the interleave process into x number of subsequences.

;; (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
;; (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
;; (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))


;; 方法一思路：根据步长分组，然后使用map vector重组，因为partition-all之后的元素还是seq，使用apply
(defn reverse-interleave-v1
  [coll n]
  "Write a function which reverses the interleave process into x number of subsequences."
  (apply map vector (partition-all n coll)))

(= (reverse-interleave-v1 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
(= (reverse-interleave-v1 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
(= (reverse-interleave-v1 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))


;; 方法二思路：根据下标取摸步长来分组，然后取值
(defn reverse-interleave-v2
  [coll n]
  "Write a function which reverses the interleave process into x number of subsequences."
  (vals (group-by #(mod (.indexOf coll %) n) coll)))

(= (reverse-interleave-v2 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
(= (reverse-interleave-v2 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
(= (reverse-interleave-v2 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
