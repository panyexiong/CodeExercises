package com.pan.bishi.xiecheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/14 - 10:39
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(fun1(arr, m, n));

    }

    public static int fun(int[][] arr, int m, int n) {
        int[] f = new int[n];
        f[0] = arr[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < m; i++) {
            f[0] = arr[i][0] == 0 ? f[0] : 0;
            for (int j = 1; j < n; j++) {
                f[j] = arr[i][j] != 0 ? 0 : (f[j] + f[j - 1]);
            }
        }
        return f[n - 1];
    }

    public static int fun1(int[][] arr, int m, int n) {
        int[] f = new int[n];
        f[0] = arr[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0){
                f[0] = f[0];
            }else {
                f[0] = 0;
            }
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0){
                    f[j] = f[j] + f[j - 1];
                }else {
                    f[j] = 0;
                }
            }
        }
        return f[n - 1];
    }
}
