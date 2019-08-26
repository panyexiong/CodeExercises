package com.pan.bishi.zijietiaodong.No02;

import java.util.Scanner;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/25 19:16
 */
public class Main01 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scanner.nextInt();
                if (j > i) {
                    if (arr[i][j] >= 3){
                        count++;
                    }
                }
            }
        }
        System.out.println(num - count);
    }
}
