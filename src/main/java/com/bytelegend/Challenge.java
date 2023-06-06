package com.bytelegend;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));

        System.out.println(Arrays.toString(filterPrimeNumbers(0, 100)));
    }

    /**
     * `filterPrimeNumbers(int start, int end)` method returns an array of all prime numbers in the
     * given `start<=n<=end` range.
     *
     * <p>For example, `filterPrimeNumbers(1, 10)` returns `[2, 3, 5, 7]`.
     *
     * <p>A prime number is a whole number greater than 1 whose only factors are 1 and itself.
     *
     * <p>Tips: for a positive integer `n`, if it's not divisible by any of the integers between 2
     * and `Math.sqrt(n)`, then `n` is a prime number.
     */
    public static int[] filterPrimeNumbers(int start, int end) {
        int[] result = IntStream.rangeClosed(start, end).filter(Challenge::isPrime).toArray();
        return result.length > 0 ? result : new int[0];

    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(num -> n % num == 0);
    }
}
