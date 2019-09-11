package com.pan.bishi.xiaomi;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/11 - 19:41
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        left(arr);
        print(arr);
    }


    /**
     * 打印二维数组
     *
     * @param arr
     */
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 向左
     *
     * @param arr
     */
    public static void left(int[][] arr) {
        int nextI, len;
        len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                nextI = -1;
                for (int k = j + 1; k < len; k++) {
                    if (arr[i][k] != 0) {
                        nextI = k;
                        break;
                    }
                }
                if (nextI != -1) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = arr[i][nextI];
                        arr[i][nextI] = 0;
                        j -= 1;
                    } else if (arr[i][j] == arr[i][nextI]) {
                        arr[i][j] *= 2;
                        arr[i][nextI] = 0;
                    }
                }
            }
        }
    }

}
