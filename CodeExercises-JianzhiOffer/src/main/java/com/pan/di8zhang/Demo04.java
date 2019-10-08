package com.pan.di8zhang;

/**
 * 求最大子数组之和
 * 问题描述：一个有n个元素的数组，这n个元素可以是正数也可以是负数，数组中连续一个或多个元素可以组成一个连续的子数组。
 *
 * @author panyexiong
 * @date 2019/10/8 - 23:06
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, 8, -4, 7, -1, 5};
//        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray1(arr));
    }

    /**
     * 暴力法
     *
     * @param arr
     * @return
     */
    public static int maxSubArray(int[] arr) {
        int len = arr.length;
        int ThisSum = 0;
        int MaxSum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                ThisSum = 0;
                for (int k = i; k < j; k++) {
                    ThisSum += arr[k];
                }
                if (ThisSum > MaxSum) {
                    MaxSum = ThisSum;
                }
            }
        }
        return MaxSum;
    }

    /**
     * 动态规划
     *
     * @param arr
     * @return
     */
    public static int maxSubArray1(int[] arr) {
        int len = arr.length;
        int end[] = new int[len];
        int all[] = new int[len];
        end[len - 1] = arr[len - 1];
        all[len - 1] = arr[len - 1];
        end[0] = all[0] = arr[0];
        for (int i = 1; i < len; ++i) {
            end[i] = Math.max(end[i - 1] + arr[i], arr[i]);
            all[i] = Math.max(end[i], all[i - 1]);
        }
        return all[len - 1];
    }

}
