;; Write a function which can rotate a sequence in either direction.

;; (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;; (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;; (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;; (= (__ 1 '(:a :b :c)) '(:b :c :a))
;; (= (__ -4 '(:a :b :c)) '(:c :a :b))

;; TODO 这种做法不太好
(defn rotate-sequence
  [n coll]
  (if (pos? n)
      (apply conj (take (mod n (count coll)) coll) (reverse (drop (mod n (count coll)) coll)))
      (apply conj (drop-last (mod (* -1 n) (count coll)) coll) (reverse (take-last (mod (* -1 n) (count coll)) coll)))))

(= (rotate-sequence 2 [1 2 3 4 5]) '(3 4 5 1 2))
(= (rotate-sequence -2 [1 2 3 4 5]) '(4 5 1 2 3))
(= (rotate-sequence 6 [1 2 3 4 5]) '(2 3 4 5 1))
(= (rotate-sequence 1 '(:a :b :c)) '(:b :c :a))
(= (rotate-sequence -4 '(:a :b :c)) '(:c :a :b))
