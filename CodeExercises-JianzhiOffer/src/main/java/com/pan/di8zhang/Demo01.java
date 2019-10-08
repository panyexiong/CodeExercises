package com.pan.di8zhang;

/**
 * 判断一个数是不是2的n次幂
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/8 18:20
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(isPower(4));
        System.out.println(isPower(6));
    }

    public static boolean isPower(int n) {
        if (n < 1) {
            return false;
        }
        int m = n & (n - 1);
        return m == 0;
    }
}
