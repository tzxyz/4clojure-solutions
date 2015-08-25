;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;; Special Restrictions frequencies

;; (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
;; (= (__ [:b :a :b :a :b]) {:a 2, :b 3})
;; (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})

;; 思路：group-by后对map进行解构
(defn count-occurrentces
  [coll]
  (into {} (map (fn [[k v]] [k (count v)]) (group-by identity coll))))

(= (count-occurrentces [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
(= (count-occurrentces [:b :a :b :a :b]) {:a 2, :b 3})
(= (count-occurrentces '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
