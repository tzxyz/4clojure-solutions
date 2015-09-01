;; Write a function which returns the symmetric difference of two sets.
;; The symmetric difference is the set of items belonging to one but not both of the two sets.

;; (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
;; (= (__ #{:a :b :c} #{}) #{:a :b :c})
;; (= (__ #{} #{4 5 6}) #{4 5 6})
;; (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

;; 思路：交集 - 并集
(defn symmetric-difference
  [s1 s2]
  (clojure.set/difference
    (clojure.set/union s1 s2)
    (clojure.set/intersection s1 s2)))

;; 思路：s1特有的 + s2特有的
(defn symmetric-difference-v2
  [s1 s2]
  (set
    (concat
      (filter (complement s1) s2)
      (filter (complement s2) s1))))

(= (symmetric-difference #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
(= (symmetric-difference #{:a :b :c} #{}) #{:a :b :c})
(= (symmetric-difference #{} #{4 5 6}) #{4 5 6})
(= (symmetric-difference #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

(= (symmetric-difference-v2 #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
(= (symmetric-difference-v2 #{:a :b :c} #{}) #{:a :b :c})
(= (symmetric-difference-v2 #{} #{4 5 6}) #{4 5 6})
(= (symmetric-difference-v2 #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})
