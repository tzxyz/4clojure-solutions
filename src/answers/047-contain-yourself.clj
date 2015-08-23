;; The contains? function checks if a KEY is present in a given collection.
;; This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.

;; (contains? #{4 5 6} __)
;; (contains? [1 1 1 1 1] __)
;; (contains? {4 :a 2 :b} __)
;; (not (contains? [1 2 4] __))

;; 当contains?的参数是vector和list时，是判断下标是否存在，而不是元素是否存在
(contains? #{4 5 6} 4)
(contains? [1 1 1 1 1] 4)
(contains? {4 :a 2 :b} 4)
(not (contains? [1 2 4] 4))
