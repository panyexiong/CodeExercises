package com.pan.dataStructure.sort;

/**
 *
 */
public class QucikSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        //中轴值
        int pivot = arr[(left + right) / 2];
        //while循环的目的是让pivot
        while (1 < r) {
            //在pivot的左边一直找，找到大于等于pivot值，才退出
            while(arr[l]<pivot){
                l++;
            }

            //在pivot的右边一直找，找到小于等于pivot值，才退出
            while(arr[r]>pivot){
                r--;
            }
            if (l>=r){
                break;
            }

        }
    }
}
