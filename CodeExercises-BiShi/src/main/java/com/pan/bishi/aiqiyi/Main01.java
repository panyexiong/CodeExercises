package com.pan.bishi.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/8 - 15:41
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));


    }
}
