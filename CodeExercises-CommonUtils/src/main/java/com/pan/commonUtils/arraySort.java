package com.pan.commonUtils;

/**
 * 二维数组排序
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 22:03
 */
public class arraySort {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,3,4,5,6,7},
                {2,1,3,2,6,5,9,4}
        };
        sort1(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 二维数组按第1行排序
     * @param arr
     */
    public static void sort1(int[][] arr){
        int[][] arr1 = new int[arr.length][arr[1].length];
        for (int i = 0; i < arr[1].length; i++) {
            int temp0 = arr[0][i];
            int temp1 = arr[1][i];
            int minIndex = i;
            for (int j = i; j < arr[1].length; j++) {
                if (arr[1][minIndex] > arr[1][j]){
                    minIndex = j;
                }
            }
            arr[1][i] = arr[1][minIndex];
            arr[0][i] = arr[0][minIndex];
            arr[0][minIndex] = temp0;
            arr[1][minIndex] = temp1;
        }

    }
}
