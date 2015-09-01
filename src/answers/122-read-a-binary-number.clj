;; Convert a binary number, provided in the form of a string, to its numerical value.

;; (= 0     (__ "0"))
;; (= 7     (__ "111"))
;; (= 8     (__ "1000"))
;; (= 9     (__ "1001"))
;; (= 255   (__ "11111111"))
;; (= 1365  (__ "10101010101"))
;; (= 65535 (__ "1111111111111111"))

;; 思路： 1001 = 2^3 + 2^0
;; 先反转字符串，过滤掉0，拿到2对应的幂，相加
(defn read-a-binary-number
  [s]
  (->> s (reverse)
         (map-indexed (fn [index value] [index value]))
         (filter #(not= \0 (last %)))
         (map first)
         (map #(reduce * (repeat % 2)))
         (reduce +)))

;; 思路：使用java的valueOf
(defn read-a-binary-number-v2
  [s]
  (Integer/valueOf s 2))

;; 思路：使用reader
(defn read-a-binary-number-v3
  [s]
  (read-string (str "2r" s)))


(= 0     (read-a-binary-number "0")                (read-a-binary-number-v2 "0")                (read-a-binary-number-v3 "0"))
(= 7     (read-a-binary-number "111")              (read-a-binary-number-v2 "111")              (read-a-binary-number-v3 "111"))
(= 8     (read-a-binary-number "1000")             (read-a-binary-number-v2 "1000")             (read-a-binary-number-v3 "1000"))
(= 9     (read-a-binary-number "1001")             (read-a-binary-number-v2 "1001")             (read-a-binary-number-v3 "1001"))
(= 255   (read-a-binary-number "11111111")         (read-a-binary-number-v2 "11111111")         (read-a-binary-number-v3 "11111111"))
(= 1365  (read-a-binary-number "10101010101")      (read-a-binary-number-v2 "10101010101")      (read-a-binary-number-v3 "10101010101"))
(= 65535 (read-a-binary-number "1111111111111111") (read-a-binary-number-v2 "1111111111111111") (read-a-binary-number-v3 "1111111111111111"))
