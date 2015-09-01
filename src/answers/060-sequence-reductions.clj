;; Write a function which behaves like reduce, but returns each intermediate value of the reduction.
;; Your function must accept either two or three arguments, and the return sequence must be lazy.
;; Special Restrictionsreductions

;; (= (take 5 (__ + (range))) [0 1 3 6 10])
;; (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
;; (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

(defn sequence-reductions
  [f & coll]
  (printf "f is %s\n" f)
  (printf "coll is %s\n" coll)
  (lazy-seq (cons (first coll) (lazy-seq (sequence-reductions f (f (first coll)))))))

(take 5 (sequence-reductions + (range)))

(= (take 5 (__ + (range))) [0 1 3 6 10])
;; (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
;; (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
