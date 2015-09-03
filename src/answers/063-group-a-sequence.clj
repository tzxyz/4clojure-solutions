;; Given a function f and a sequence s, write a function which returns a map.
;; The keys should be the values of f applied to each item in s.
;; The value at each key should be a vector of corresponding items in the order they appear in s.
;; Special Restrictionsgroup-by

;; (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
;; (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
;; (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

;; 思路：使用map计算出s中每一项(f item)的值，转换成map后merge
(defn group-by-sequence
  [f s]
  (->> s
       (map (fn [item] {(f item) [item]}))
       (apply merge-with concat)))

(= (group-by-sequence #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
(= (group-by-sequence #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
(= (group-by-sequence count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})
