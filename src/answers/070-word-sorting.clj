;; Write a function that splits a sentence up into a sorted list of words.
;; Capitalization should not affect sort order and punctuation should be ignored.

;; (= (__  "Have a nice day.") ["a" "day" "Have" "nice"])
;; (= (__  "Clojure is a fun language!") ["a" "Clojure" "fun" "is" "language"])
;; (= (__  "Fools fall for foolish follies.") ["fall" "follies" "foolish" "Fools" "for"])

(defn word-sorting
  [s]
  (sort-by (fn [s-seq] (.toUpperCase s-seq)) (re-seq #"\w+" s)))

(= (word-sorting "Have a nice day.") ["a" "day" "Have" "nice"])
(= (word-sorting "Clojure is a fun language!") ["a" "Clojure" "fun" "is" "language"])
(= (word-sorting "Fools fall for foolish follies.") ["fall" "follies" "foolish" "Fools" "for"])

;; (sort-by keyfn coll)
;; keyfn:根据keyfn排序 coll:待排序序列
;; return 排好序的序列
;; 如果coll是数组，那么这么数组会被改变


