package com.pan.sort;

import java.util.Arrays;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/12 9:40
 */
public class Demo01 {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {9, 1, 4, 2, 8, 3, 7, 5, 0, 6, -2};
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
