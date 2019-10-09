package com.pan.di8zhang;

/**
 * 找出数组中只出现一次的数字
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/9 11:11
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 4, 3, 5, 4, 1};
        int num = findOnlyOneTime(arr);
        System.out.println(num);

        System.out.println(findOnce(arr, 2));
    }

    /**
     * 一个整形数组里除了一个数字之外，其他数字都出现了两次。
     *
     * @param arr
     * @return
     */
    public static int findOnlyOneTime(int[] arr) {
        int len = arr.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result ^= arr[i];
        }
        return result;
    }

    /**
     *
     * @param arr
     * @param appearTimes
     * @return
     */
    public static int findOnce(int[] arr, int appearTimes) {
        int len = arr.length;
        int[] bitCount = new int[32];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 32; j++) {
                bitCount[j] += ((arr[i] >> j) & 1);
            }
        }
        int appearOne = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % appearTimes != 0) {
                appearOne += (1 << i);
            }
        }
        return appearOne;
    }

}
