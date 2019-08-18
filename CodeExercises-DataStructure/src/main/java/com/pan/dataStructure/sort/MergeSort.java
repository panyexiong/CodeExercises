package com.pan.dataStructure.sort;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/17 10:43
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};

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
        while (i<=mid && j<=right){
            //如果左边的有序序列的当前元素，小于等于右边有序
            if (arr[i] <= arr[j]){
                temp[t] = arr[i];

            }
        }


        //把有剩余数据的一边的数据依次全部填充到temp
    }
}
