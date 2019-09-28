package com.pan.dataStructure.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        System.out.println("未排序："+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            //从i+1开始遍历，找出最小的数，记录它的索引位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
            System.out.printf("第%d轮排序："+Arrays.toString(arr),i);
            System.out.println("");
        }
        System.out.println("最终排序结果："+Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

