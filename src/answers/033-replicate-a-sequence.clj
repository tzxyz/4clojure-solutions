;; Write a function which replicates each element of a sequence a variable number of times.

;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])

(defn replicate-a-sequence
  [coll times]
  "Write a function which replicates each element of a sequence a variable number of times."
  (apply interleave (map identity (repeat times coll))))


(replicate-a-sequence [1 2 3] 2)
(replicate-a-sequence [:a :b] 4)

;; 4clojure上这个case没有通过，本地通过了
;; 将clojure的版本换成1.7.0就通过了
(replicate-a-sequence [4 5 6] 1)
(replicate-a-sequence [[1 2] [3 4]] 2)
(replicate-a-sequence [44 33] 2)

;; 为了通过测试这样写
(= ((fn [coll times]
      (if (= 1 times)
          coll
          (apply interleave (map identity (repeat times coll))))) [4 5 6] 1) '(4 5 6))
