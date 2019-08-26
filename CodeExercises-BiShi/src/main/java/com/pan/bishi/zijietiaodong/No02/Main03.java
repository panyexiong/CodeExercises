package com.pan.bishi.zijietiaodong.No02;

import java.util.Scanner;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/25 19:46
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        switch (direction) {
            //向上
            case 1:
                int[][] change1 = change(arr);
                int[][] change2 = change(change1);
                int[][] change3 = change(change2);
                left(change3);
                arr = change(change3);
                break;
            //向下
            case 2:
                int[][] change21 = change(arr);
                left(change21);
                arr = change(change21);
                arr = change(arr);
                arr = change(arr);
                break;
            //向左
            case 3:
                left(arr);
                break;
            //向右
            case 4:
                int[][] change41 = change(arr);
                int[][] change42 = change(change41);
                left(change42);
                arr = change(change42);
                arr = change(arr);
                break;
            default:
                break;
        }

        print(arr);
    }

    /**
     * 打印二维数组
     * @param arr
     */
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 二维数组顺时针旋转90度
     * @param matrix
     * @return
     */
    public static int[][] change(int[][] matrix) {
        int[][] temp = new int[matrix[0].length][matrix.length];
        int dst = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++, dst--) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][dst] = matrix[i][j];
            }
        }
        return temp;
    }

    /**
     * 向左
     * @param arr
     */
    public static void left(int[][] arr){
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
