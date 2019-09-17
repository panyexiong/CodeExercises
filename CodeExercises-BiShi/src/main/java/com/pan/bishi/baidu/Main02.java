package com.pan.bishi.baidu;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/17 - 18:54
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arrm = new int[m][2];
        int[][] arrk = new int[k][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arrm[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 3; j++) {
                arrk[i][j] = scanner.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            min = Math.min(arrk[i][2],min);
        }
        System.out.println(min);
    }
}
