package com.bytelegend;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 3; i <= end; i++) {
            boolean flag = true;
            for (int p: primes) {
                if (i % p == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primes.add(i);
            }
        }
        List<Integer> re = new ArrayList<>();

        for (int p: primes) {
            if (p >= start && p <= end) {
                re.add(p);
            }
        }
        int[] arr = new int[re.size()];
        int i = 0;
        for (int p: re) {
            arr[i++] = p;
        }
        return arr;
    }
}
