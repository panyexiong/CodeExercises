package com.pan.bishi.wubatongcheng;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/12 - 20:32
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowLines = scanner.nextInt();
        int colLines = scanner.nextInt();
        int[][] arr = new int[rowLines][colLines];

        for (int i = 0; i < rowLines; i++) {
            for (int j = 0; j < colLines; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


    }

    public static void fun(int[] arr, int row, int col) {

    }
}

