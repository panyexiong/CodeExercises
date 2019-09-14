package com.pan.bishi.wubatongcheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 分糖果
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

    public static int candy(int[] ratings) {
        int sum = 0;
        int[] left2right = new int[ratings.length];
        int[] right2left = new int[ratings.length];
        Arrays.fill(left2right, 1);
        Arrays.fill(right2left, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left2right[i] = left2right[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right2left[i] = right2left[i + 1] + 1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(left2right[i], right2left[i]);
        }
        return sum;
    }

}

