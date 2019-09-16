package com.pan.bishi.wubatongcheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/16 - 20:59
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int[] arr1 = new int[num];
        int maxLen = 0;
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (i == 0) {
                    arr1 = Arrays.copyOf(arr, num);
                    arr1[i] = arr[i + 1] - 1;
                }else {
                    if (arr[i+1]-1 > arr[i-1]){
                        arr1 = Arrays.copyOf(arr, num);
                        arr1[i] = arr[i + 1] - 1;
                    }
                }
            }
            maxLen = Math.max(maxLen,fun(arr1));
        }
        System.out.println(maxLen);
    }

    public static int fun(int[] arr) {
        int len = arr.length;
        int max = 0;
        int cur = 0;
        if (len < 2) {
            return len;
        }
        for (int i = 0; i < len - 1; i++) {
            cur++;
            if (max < cur) {
                max = cur;
            }
            if (arr[i] >= arr[i + 1]) {
                cur = 0;
            }
        }
        cur++;
        if (max < cur) {
            max = cur;
        }
        return max;
    }
}
