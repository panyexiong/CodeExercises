package com.pan.bishi.jingdong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/24 - 19:49
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] hight = new int[num];
        for (int i = 0; i < num; i++) {
            hight[i] = scanner.nextInt();
        }

        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = i;
            arr[i][1] = hight[i];
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i][0]+" ");
            System.out.print(arr[i][1]+" ");
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            int[] insert = arr[i];
        }

    }

    public static int findMinIndex(int[] arr){
        int minIndex=0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
