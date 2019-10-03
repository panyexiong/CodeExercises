package com.pan.commonDemo;

import org.junit.Test;

/**
 * 最大公约数
 *
 * @author panyexiong
 * @date 2019/10/3 - 13:48
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(gcd1(48, 36));
    }

    /**
     * 暴力法
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        for (int i = a > b ? a : b; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    /**
     * 欧几里得算法
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd1(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (a == b || a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a < b) {
            return gcd1(a, b % a);
        } else {
            return gcd1(b, a % b);
        }
    }
}
