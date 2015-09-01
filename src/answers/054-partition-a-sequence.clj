;; Write a function which returns a sequence of lists of x items each.
;; Lists of less than x items should not be returned.
;; Special Restrictions partition partition-all

;; (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
;; (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
;; (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))

;; 思路：长度不足x的先删掉，递归take和drop
(defn partition-a-sequence
  [n s]
  (loop [s1 '[]
         s2 (drop-last (mod (count s) n) s)]
    (if
      (empty? s2)
      s1
      (recur (conj s1 (take n s2)) (drop n s2)))))

(= (partition-a-sequence 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
(= (partition-a-sequence 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
(= (partition-a-sequence 3 (range 8)) '((0 1 2) (3 4 5)))
