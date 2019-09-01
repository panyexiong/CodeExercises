package com.pan.bishi.tengxun.tx02;

import java.util.*;

/**
 * @author panyexiong
 * @date 2019/9/1 - 19:56
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr1 = new int[num][2];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = scanner.nextInt();
            }
            map.put(i, arr1[i]);
        }

        int[] minArr = new int[num];
        int sum =0;
        for (int i = 1; i <= num; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= num; j++) {
                int min1 = map.get(i-1)[0] * (j-1) + map.get(i-1)[1] * (num - j);
                min = Math.min(min, min1);
            }
            minArr[i-1] = min;
            sum += min;
        }
        System.out.println(sum);

    }
}
