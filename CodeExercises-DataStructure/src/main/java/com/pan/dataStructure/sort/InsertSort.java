package com.pan.dataStructure.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        System.out.println("原始数组："+Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            //insertVal需要插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                //后移一位
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //循环结束，表示找到插入的位置
            arr[insertIndex + 1] = insertVal;
            System.out.printf("第%d轮排序"+Arrays.toString(arr)+"\n",i-1);
        }


    }
}
