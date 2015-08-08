;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers.
;; If two sub-sequences have the same length, use the one that occurs first.
;; An increasing sub-sequence must have a length of 2 or greater to qualify.

;; (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
;; (= (__ [5 6 1 3 2 7]) [5 6])
;; (= (__ [2 3 3 4 5]) [3 4 5])
;; (= (__ [7 6 5 4]) [])

(defn longest-increasing-sub-seq
  [coll]
  "Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. "
  (loop [sub-seq (list)
         coll coll]
    (if (= (first coll) (inc (first (rest coll))))
      (conj sub-seq (first coll))
      (recur sub-seq (rest coll)))))


;; TODO 没解决
(longest-increasing-sub-seq [1 2 3 0 4 5])

(->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc))

(->> [2 5 4 1 3 6]
     (drop 2)
     (take 3)
     (map inc)
     (reduce +))

;; (map inc (take 3 (drop 2 [2 5 4 1 3 6])))
;; ((fn [args] (reduce + args)) (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
