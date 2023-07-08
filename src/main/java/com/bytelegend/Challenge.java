package com.bytelegend;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));
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
        if (end < 2) return new int[0];
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        boolean isPrime = true;
        for (int i = 3; i <= end; i++) {
            for (int idx = 0; primes.get(idx) <= (int)Math.sqrt(i); idx++) {
                if (i % primes.get(idx) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            } else {
                isPrime = true;
            }
        }

        int count = 0;
        for (Integer prime : primes) {
            if (start <= prime) count++;
        }

        int[] ans = new int[count];
        count = 0;
        for (Integer prime : primes) {
            if (start <= prime) ans[count++] = prime;
        }
        return ans;
    }
}
