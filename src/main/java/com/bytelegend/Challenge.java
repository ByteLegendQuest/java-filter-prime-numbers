package com.bytelegend;

import java.util.Arrays;

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
        int[] a = new int[0];
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    int[] b = {i};
                    int[] c = new int[a.length + b.length];
                    System.arraycopy(a, 0, c, 0, a.length);
                    System.arraycopy(b, 0, c, a.length, b.length);
                    a = c;
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        return a;
}
