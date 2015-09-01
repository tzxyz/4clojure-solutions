;; Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
;; Special Restrictions juxt

;; (= [21 6 1] ((__ + max min) 2 3 5 1 6 4))
;; (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello"))
;; (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))

(defn juxtaposition
  [& fns]
  (fn
    [& args]
    (loop [v []
           fns fns]
      (if
        (empty? fns)
        v
        (recur (cons (apply (last fns) args) v)
               (drop-last fns))))))

((juxtaposition + max min) 2 3 5 1 6 4)
(= ["HELLO" 5] ((juxtaposition #(.toUpperCase %) count) "hello"))
(= [2 6 4] ((juxtaposition :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
