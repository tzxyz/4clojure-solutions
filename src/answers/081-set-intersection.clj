;; Write a function which returns the intersection of two sets.
;; The intersection is the sub-set of items that each set has in common.
;; Special Restrictions intersection

;; (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
;; (= (__ #{0 1 2} #{3 4 5}) #{})
;; (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

;; 思路：使用用解析x存在于s1并且存在于s2
(defn intersection
  [s1 s2]
  (set (for [x (clojure.set/union s1 s2) :when (and (contains? s1 x) (contains? s2 x))] x)))

;; 思路：把set当做函数
(defn intersection-v2
  [s1 s2]
  (set (filter s1 s2)))

(= (intersection #{0 1 2 3} #{2 3 4 5}) #{2 3})
(= (intersection #{0 1 2} #{3 4 5}) #{})
(= (intersection #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

(= (intersection-v2 #{0 1 2 3} #{2 3 4 5}) #{2 3})
(= (intersection-v2 #{0 1 2} #{3 4 5}) #{})
(= (intersection-v2 #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
