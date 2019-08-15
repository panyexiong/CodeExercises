package com.pan.dataStructure.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.printf("第%d轮排序："+Arrays.toString(arr),i);
            System.out.println("");
        }
        System.out.println("最终排序结果："+Arrays.toString(arr));
    }
}

