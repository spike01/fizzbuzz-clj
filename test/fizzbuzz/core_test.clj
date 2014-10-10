(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest is-divisible-by-three
  (testing "3 divisible by 3"
    (is (= true (is-divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
  (testing "1 divisible by 3"
    (is (= false (is-divisible-by-three? 1)))))

(deftest is-divisible-by-five
  (testing "5 divisible by 5"
    (is (= true (is-divisible-by-five? 5)))))

(deftest is-not-divisible-by-five
  (testing "5 divisible by 5"
    (is (= false (is-divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
  (testing "15 divisible by 15"
    (is (= true (is-divisible-by-fifteen? 15)))))

(deftest is-not-divisible-by-fifteen
  (testing "1 divisible by 15"
    (is (= false (is-divisible-by-fifteen? 1)))))

(deftest is-divisible-by-seven
  (testing "7 divisible by 7"
    (is (= true (is-divisible-by? 7 7)))))

(deftest is-not-divisible-by-seven
  (testing "1 divisible by 7"
    (is (= false (is-divisible-by? 1 7)))))

(deftest fizz-on-fizz
  (testing "Fizz on 9"
    (is (= "Fizz" (fizz-buzz 9)))))

(deftest buzz-on-buzz
  (testing "Buzz on 20"
    (is (= "Buzz" (fizz-buzz 20)))))

(deftest fizzbuzz-on-fizzbuzz
  (testing "Fizzbuzz on 15"
    (is (= "Fizzbuzz" (fizz-buzz 15)))))

(deftest number-on-number
  (testing "Number on 7"
    (is (= 7 (fizz-buzz 7)))))
