package com.pan.sort;

import java.util.Arrays;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 20:03
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 6, 3, 1, 4, 9, -1, 0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //轮次
        for (int i = 0; i < arr.length - 1; i++) {
            //记录最小的索引
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
