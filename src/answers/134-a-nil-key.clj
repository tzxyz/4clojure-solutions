;; Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.

;; (true?  (__ :a {:a nil :b 2}))
;; (false? (__ :b {:a nil :b 2}))
;; (false? (__ :c {:a nil :b 2}))

(defn a-nil-key
  [key coll]
  (and (contains? coll key)
       (= nil (get coll key))))

(a-nil-key :a {:a nil :b 2})
(a-nil-key :b {:a nil :b 2})

(true? true)
(false? false)
(false? (a-nil-key :c {:a nil :b 2}))
