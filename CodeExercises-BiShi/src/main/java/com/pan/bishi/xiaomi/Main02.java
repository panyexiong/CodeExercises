package com.pan.bishi.xiaomi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/11 - 19:51
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min1 = Math.min(fun(arr), fun1(arr));
        int min2 = Math.min(fun01(arr), fun2(arr));
        System.out.println(Math.max(min1,min2));

    }

    public static int fun(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            //insertVal需要插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;
            if (insertVal < arr[insertIndex]) {
                count++;
                while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                    //后移一位
                    arr[insertIndex + 1] = arr[insertIndex];
                    insertIndex--;
                }
                //循环结束，表示找到插入的位置
                arr[insertIndex + 1] = insertVal;
//                System.out.printf("第%d轮排序" + Arrays.toString(arr) + "\n", i - 1);
            }
        }
        return count;
    }

    public static int fun01(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            //insertVal需要插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;
            if (insertVal > arr[insertIndex]) {
                count++;
                while (insertIndex >= 0 && insertVal > arr[insertIndex]) {
                    //后移一位
                    arr[insertIndex + 1] = arr[insertIndex];
                    insertIndex--;
                }
                //循环结束，表示找到插入的位置
                arr[insertIndex + 1] = insertVal;
//                System.out.printf("第%d轮排序" + Arrays.toString(arr) + "\n", i - 1);
            }
        }
        return count;
    }

    public static int fun1(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int count = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            int insertVal = arr[i];
            int insertIndex = i + 1;
            if (insertVal > arr[insertIndex]) {
                count++;
                while (insertIndex <= arr.length - 1 && insertVal > arr[insertIndex]) {
                    //前移一位
                    arr[insertIndex - 1] = arr[insertIndex];
                    insertIndex++;
                }
                arr[insertIndex - 1] = insertVal;
//                System.out.printf("第%d轮排序" + Arrays.toString(arr) + "\n", arr.length - i - 1);
            }
        }
        return count;
    }

    public static int fun2(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int count = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            int insertVal = arr[i];
            int insertIndex = i + 1;
            if (insertVal < arr[insertIndex]) {
                count++;
                while (insertIndex <= arr.length - 1 && insertVal < arr[insertIndex]) {
                    //前移一位
                    arr[insertIndex - 1] = arr[insertIndex];
                    insertIndex++;
                }
                arr[insertIndex - 1] = insertVal;
//                System.out.printf("第%d轮排序" + Arrays.toString(arr) + "\n", arr.length - i - 1);
            }
        }
        return count;
    }
}
