;; Write a function which duplicates each element of a sequence.

;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(defn duplicate-a-sequenece
  [coll]
  (#(interleave % %) coll))

(= (#(interleave % %) [1 2 3]) '(1 1 2 2 3 3))
(= (#(interleave % %) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (#(interleave % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
