package com.pan.commonClasses.digui;

/**
 * 二分查找
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 16:22
 */
public class BinarySearch {

    /**
     * 递归实现
     *
     * @param array
     * @param low
     * @param high
     * @param target
     * @return
     */
    public static int fun1(int[] array, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                fun1(array, low, mid - 1, target);
            } else {
                fun1(array, mid + 1, high, target);
            }
        }
        return -1;
    }

    public static int binarySearchNoRecursive(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
