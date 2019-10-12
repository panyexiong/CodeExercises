package com.pan.sort;

import java.util.Arrays;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/12 9:53
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 2, 8, 3, 7, 5, 0, 6, -2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
    }
}
