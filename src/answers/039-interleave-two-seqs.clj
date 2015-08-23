;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; Special Restrictions interleave

;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;; (= (__ [1 2 3 4] [5]) [1 5])
;; (= (__ [30 20] [25 15]) [30 25 20 15])

;; map与mapcat会将第一个item的第一个值，第二个item的第一个值做为参数
(defn interleave-two-sequence
  [s1 s2]
  (mapcat vector s1 s2))

(= (interleave-two-sequence [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(= (interleave-two-sequence [1 2] [3 4 5 6]) '(1 3 2 4))
(= (interleave-two-sequence [1 2 3 4] [5]) [1 5])
(= (interleave-two-sequence [30 20] [25 15]) [30 25 20 15])
