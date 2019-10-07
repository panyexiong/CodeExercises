package com.pan.dataStructure.sort;

import java.util.Random;

/**
 * @author panyexiong
 * @date 2019/10/6 - 23:56
 */
public class MergeSortThread {
    static Random random = new Random();
    static int[] arr = new int[10000];
    static{
        for (int i = 0; i < 10000; i++) {
            arr[i] = random.nextInt(10000);
        }
    }



}
