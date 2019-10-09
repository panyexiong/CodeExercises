package com.pan.di8zhang;

/**
 * 找出数组中唯一重复的元素
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/9 16:22
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5,2, 3, 4};
        int missingNum = xor_findDup(arr);
        System.out.println(missingNum);
    }

    public static int xor_findDup(int[] arr) {
        int len = arr.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result ^= arr[i];
        }
        for (int i = 1; i < len; i++) {
            result ^= i;
        }
        return result;
    }
}
