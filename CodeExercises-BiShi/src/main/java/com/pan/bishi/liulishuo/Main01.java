package com.pan.bishi.liulishuo;


import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/11 - 20:51
 */
public class Main01 {
    static int zero;
    static int count;
    static int count1;
    static int result;

    public static int fun(int[][] arr) {
        int row = -1;
        int col = -1;
        int rowLines = arr.length;
        int colLines = arr[0].length;
        for (int i = 0; i < rowLines; i++) {
            for (int j = 0; j < colLines; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                }
                if (arr[i][j] == 2) {
                    row = i;
                    col = j;
                }
            }
        }
        fun1(arr, row, col, rowLines, colLines);
        return count1;
    }

    public static void fun1(int[][] arr, int row, int col, int rl, int cl) {
        if (arr[row][col] == 3) {
            if (count+1 == zero) {
                result++;
            }
            return;
        }
        if (arr[row][col] == 0) {
            count++;
            count1++;
        }
        if (row + 1 < rl && arr[row + 1][col] != 1) {
            arr[row][col] = 1;
            fun1(arr, row + 1, col, rl, cl);
            arr[row][col] = 0;
        }

        if (row - 1 >= 0 && arr[row - 1][col] != 1) {
            arr[row][col] = 1;
            fun1(arr, row - 1, col, rl, cl);
            arr[row][col] = 0;
        }

        if (col + 1 < cl && arr[row][col + 1] != 1) {
            arr[row][col] = 1;
            fun1(arr, row, col + 1, rl, cl);
            arr[row][col] = 0;
        }

        if (col - 1 >= 0 && arr[row][col - 1] != 1) {
            arr[row][col] = 1;
            fun1(arr, row, col - 1, rl, cl);
            arr[row][col] = 0;
        }

        if (arr[row][col] == 0) {
            count--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{2, 0, 0, 1}, {0, 1, 0, 1}, {1, 0, 0, 0}, {3, 0, 1, 0}};
        int num = fun(arr);
        System.out.println(num);

    }
}
