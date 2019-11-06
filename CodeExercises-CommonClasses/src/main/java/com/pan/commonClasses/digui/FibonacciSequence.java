package com.pan.commonClasses.digui;

/**
 * 斐波那契数列
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 15:02
 */
public class FibonacciSequence {

    /**
     * 经典递归法
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 经典递归法的优化
     *
     * @param first
     * @param second
     * @param n
     * @return
     */
    public static int optimizeFibonacci(int first, int second, int n) {
        if (n > 0) {
            if (n == 1) {
                return first;
            } else if (n == 2) {
                return second;
            } else if (n == 3) {
                return first + second;
            }
            return optimizeFibonacci(second, first + second, n - 1);
        }
        return -1;
    }

    /**
     * 非递归解法：有去无回
     *
     * @param n
     * @return
     */
    public static int fibonacci_loop(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int result = -1;
        int first = 1;
        int second = result;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /**
     * 使用数组存储斐波那契数列
     *
     * @param n
     * @return
     */
    public static int fibonacci_array(int n) {
        if (n > 0) {
            int[] arr = new int[n];
            arr[0] = arr[1] + 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n - 1];
        }
        return -1;
    }

}
