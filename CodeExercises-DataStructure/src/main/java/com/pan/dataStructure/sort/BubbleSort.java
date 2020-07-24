package com.pan.dataStructure.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换数组中的两个索引位置上的元素
     *
     * @param arr
     * @param index1
     * @param index2
     */
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    /**
     * 优化冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        //flag，标记此趟排序有没有产生交换
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    swap(arr, j, j + 1);
                }
            }
            //flag==false表示一次交换都没有发生，表示已经排序完成
            if (flag == false) {
                break;
            } else {
                //重置flag，进行下次判断
                flag = false;
            }
        }
    }
}
