;; Write a function which will split a sequence into two parts.
;; Special Restrictions split-at

;; (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;; (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;; (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(defn split-a-sequence
  [n coll]
  "Write a function which will split a sequence into two parts."
  (vector (take n coll) (drop n coll)))

(= (split-a-sequence 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
(= (split-a-sequence 1 [:a :b :c :d]) [[:a] [:b :c :d]])
(= (split-a-sequence 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

