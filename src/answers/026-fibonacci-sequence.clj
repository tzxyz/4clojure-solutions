;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))




(defn pack-a-sequence
  [coll]
  ""
  (partition-by identity coll))

(pack-a-sequence [1 1 2 1 1 1 3 3])
(pack-a-sequence [:a :a :b :b :c])
