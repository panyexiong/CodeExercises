package com.pan.bishi.xiecheng;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/14 - 10:56
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[][] arr1 = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        int[] xihao = new int[M];
        for (int i = 0; i < M; i++) {

        }


    }
}
