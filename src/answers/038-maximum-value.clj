(fn [& coll]
  (reduce
    (fn [x y] (if (> x y) x y)) coll))
