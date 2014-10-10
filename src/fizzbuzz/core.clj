(ns fizzbuzz.core)

(defn is-divisible-by-three? [number]
  (= 0 (mod number 3)))

(defn is-divisible-by-five? [number]
  (= 0 (mod number 5)))

(defn is-divisible-by-fifteen? [number]
  (= 0 (mod number 15)))

(defn is-divisible-by? [number, divisor]
  (= 0 (mod number divisor)))

(defn fizz-buzz [number]
  (if (is-divisible-by? number 15) (str "Fizzbuzz")
    (if (is-divisible-by? number 3) (str "Fizz")
      (if (is-divisible-by? number 5) (str "Buzz")))))
