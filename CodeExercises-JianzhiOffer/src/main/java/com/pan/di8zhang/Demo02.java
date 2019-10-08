package com.pan.di8zhang;

/**
 * 求一个数的二进制中1的个数
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/8 20:02
 */
public class Demo02 {

    public static void main(String[] args) {
        System.out.println(countOneFunction1(7));
        System.out.println(countOneFunction1(8));
    }

    /**
     * 思路：判断这个数的最后一位是否为1.如果为1，则计数器加1，然后通过右移一位丢弃掉最后一位。循环判断知道n=0为止
     *
     * @param n
     * @return
     */
    public static int countOneFunction1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static int countOneFunction2(int n) {
        int count = 0;
        while (n > 0) {
            if (n != 0) {
                n = n & (n - 1);
                count++;
            }
        }
        return count;
    }

}
