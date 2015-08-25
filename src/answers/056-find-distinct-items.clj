;; Write a function which removes the duplicates from a sequence.
;; Order of the items must be maintained.
;; Special Restrictions distinct

;; (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
;; (= (__ [:a :a :b :b :c :c]) [:a :b :c])
;; (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
;; (= (__ (range 50)) (range 50))

(defn find-distinct-items [coll]
  (seq (apply sorted-set (seq coll))))

(find-distinct-items [1 2 1 3 1 2 4])
(find-distinct-items '([2 4] [1 2] [1 3] [1 3]))
(= (find-distinct-items [1 2 1 3 1 2 4]) [1 2 3 4])
(= (find-distinct-items [:a :a :b :b :c :c]) [:a :b :c])
(= (find-distinct-items '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
(= (find-distinct-items (range 50)) (range 50))
