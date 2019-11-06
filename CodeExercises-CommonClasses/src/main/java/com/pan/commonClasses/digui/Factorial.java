package com.pan.commonClasses.digui;

/**
 * 阶乘
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 14:58
 */
public class Factorial {
    /**
     * 递归实现
     *
     * @param n
     * @return
     */
    public static long fun(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fun(n - 1);
        }
    }

    /**
     * 非递归实现
     *
     * @param n
     * @return
     */
    public static long f_loop(int n) {
        long result = n;
        while (n > 1) {
            n--;
            result = result * n;
        }
        return result;
    }
}
