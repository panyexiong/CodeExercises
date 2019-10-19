package com.pan.dataStructure.sort;

import java.util.Arrays;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/17 10:43
 */
public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //向左递归进行分解
            mergeSort(arr, left, mid, temp);
            //向右递归进行分解
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    /**
     * 合并方法
     *
     * @param arr   排序的原始数据
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  中转数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        //初始化i，左边有序序列的初始索引
        int i = left;
        //初始化j，右边有序序列的初始索引
        int j = mid + 1;
        //指定temp数组的当前索引
        int t = 0;

        //先把左右两边（有序）的数据按照规则到temp数组
        //直到左右两边的有序序列，有一边处理完毕为止
        while (i <= mid && j <= right) {
            //如果左边的有序序列的当前元素，小于等于右边有序
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                i++;
                t++;
            } else {
                temp[t] = arr[j];
                j++;
                t++;
            }
        }

        //把有剩余数据的一边的数据依次全部填充到temp
        //左边还有剩余元素，就全部填充到temp中
        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            j++;
            t++;
        }

        t = 0;
        int tempLeft = left;
//        System.out.println("tempLeft = " + tempLeft + ", right = " + right);
        while (left <= right) {
            arr[left] = temp[t];
            t++;
            left++;
        }
    }
}
