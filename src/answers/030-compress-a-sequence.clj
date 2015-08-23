;; Write a function which removes consecutive duplicates from a sequence.
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(defn compress-a-sequence
  [s]
  "Write a function which removes consecutive duplicates from a sequence."
  (map first (partition-by identity s)))

;; 按照自己本身的值进行partition，取第一个
(compress-a-sequence "Leeeeeerrroyyy")
(compress-a-sequence [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)
(compress-a-sequence [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])
