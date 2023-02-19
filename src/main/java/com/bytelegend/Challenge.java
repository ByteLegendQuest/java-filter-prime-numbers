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
        List<Integer> arr = new ArrayList();
        if (start <= 3 && end >= 3) {
            arr.add(2);
            arr.add(3);
        } else if (start <= 2 && end >= 2) {
            arr.add(2);
        }
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (int) Math.sqrt(i)) {
                    arr.add(i);
                }
            }
        }
        int[] ints = arr.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(ints));
        return ints;
    }
}
