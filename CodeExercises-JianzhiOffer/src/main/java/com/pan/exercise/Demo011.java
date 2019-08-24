package com.pan.exercise;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 14:19
 */
public class Demo011 {

    public static void main(String[] args) {
        System.out.println(NumberOf1(53));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            //每次判断最低位是否为1
            count += (n & 1);
            //无符号右移
            n >>>= 1;
        }
        return count;
    }
}
