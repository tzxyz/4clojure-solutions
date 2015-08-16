;; Write a function which replicates each element of a sequence a variable number of times.

;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])

(defn replicate-a-sequence
  [coll times]
  "Write a function which replicates each element of a sequence a variable number of times."
  (interleave (repeat times coll)))


(repeat 2 [1 2 3])

(replicate-a-sequence [1 2 3] 2)
(replicate-a-sequence [:a :b] 4)

(defn te
  [coll times]
  (last (take times (iterate (fn [coll] (interleave coll coll)) coll))))

(te [1 2 3] 2)

(defn aa [times coll]
  (interleave ))

(aa 2 [1 2 3])
(aa 4 [:a :b])

(defn fuck [value coll]
  (drop-last (interleave coll (repeat value))))



(fuck 0 [1 2 3])
(fuck :z [:a :b :c :d])

