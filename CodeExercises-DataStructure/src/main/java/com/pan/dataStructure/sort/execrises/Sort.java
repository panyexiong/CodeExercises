package com.pan.dataStructure.sort.execrises;

import sun.misc.LRUCache;

import java.util.Arrays;

/**
 * @author panyexiong
 * @date 2019/10/16 - 9:44
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 7, 2, -6, 3, 5, 4, 6, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = getIndex(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    public static int getIndex(int[] arr, int left, int right) {
        //枢纽元
        int temp = getTemp(arr, left, right);
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }

    /**
     * 获取枢纽元
     *
     * @param arr
     * @return
     */
    public static int getTemp(int[] arr, int left, int right) {
        int l = arr[left];
        int r = arr[right];
        int mid = arr[(left + right) / 2];
        int max = l >= r ? l : r;
        int min = l <= r ? l : r;
        max = max >= mid ? max : mid;
        min = min <= mid ? min : mid;
        int sum = l + r + mid;
        return sum - max - min;

    }
}
