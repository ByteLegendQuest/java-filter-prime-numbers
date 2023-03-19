package com.bytelegend;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        return IntStream.rangeClosed(start, end).filter(Challenge::isPrime).toArray();
    }

    // 定义一个静态方法isPrime，接受一个整型参数number，返回一个布尔值表示number是否是质数
    public static boolean isPrime(int number) {
        // 如果number小于2，直接返回false，因为2是最小的质数
        if (number < 2) {
            return false;
        }
        // 使用IntStream类的rangeClosed方法生成从2到number/2的整数流，并使用noneMatch方法检查是否没有任何元素能够被number整除
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
}
