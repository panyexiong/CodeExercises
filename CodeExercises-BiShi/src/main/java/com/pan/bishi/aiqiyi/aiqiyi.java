package com.pan.bishi.aiqiyi;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/8 15:06
 */
public class aiqiyi {
    public static void main(String[] args) {
        double[] nums = {-1.6};
        for (double num : nums) {
            test(num);
        }
    }

    private static void test(double num){
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
    }
}

