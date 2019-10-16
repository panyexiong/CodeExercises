package com.pan.dataStructure.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 7, 2, -6, 3, 5, 4, 6, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = getIndex(arr, left, right);
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    public static int getIndex(int[] arr, int left, int right) {
        int temp = arr[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (r > l && arr[r] >= temp) {
                r--;
            }
            arr[l] = arr[r];
            while (l < r && arr[l] <= temp) {
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = temp;
        return l;
    }
}
