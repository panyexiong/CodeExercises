package com.pan.dataStructure.search;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/18 9:36
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -2, 3, 4, 5, 6, 77, 888, 999};
        System.out.println(binarySearch(arr,0,arr.length,0));
    }

    /**
     * @param arr       数组
     * @param left      左边的索引
     * @param right     右边的索引
     * @param findValue 要查找的值
     * @return 如果找到就返回下标，没有找到就返回-1
     */
    public static int binarySearch(int[] arr, int left, int right, int findValue) {
        if (left>right){
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findValue > midVal) {
            //向右递归
            return binarySearch(arr, mid + 1, right, findValue);
        } else if (findValue < midVal){
            return binarySearch(arr,left,mid-1,findValue);
        }else {
            return mid;
        }
    }
}
