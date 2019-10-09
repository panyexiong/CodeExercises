package com.pan.di8zhang;

/**
 * 求数组中第二大的数字
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/8 20:41
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 9, 0, 4, 13, -1, 8};
        System.out.println(FindSecMax(arr));
    }

    public static int FindSecMax(int data[]) {
        int len = data.length;
        int maxNum = data[0];
        int sec_max = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            if (data[i] > maxNum) {
                sec_max = maxNum;
                maxNum = data[i];
            } else {
                if (data[i] > sec_max) {
                    sec_max = data[i];
                }
            }
        }
        return sec_max;
    }
}
