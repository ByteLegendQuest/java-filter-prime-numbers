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
        if (end < 2)
            return null;
        else if (end == 2)
            return new int[]{2};
        else {
            List<Integer> result = new ArrayList<>();
            result.add(2);
            label : for (int x = 3; x <= end; x++) {
                for (int y = 2; y <= Double.valueOf(Math.sqrt(x)).intValue(); y++) {
                    if (0 == x % y) {
                        continue label;
                    }
                }
                result.add(x);
            }
            return result.stream().mapToInt(x -> x).toArray();
        }
    }
}
