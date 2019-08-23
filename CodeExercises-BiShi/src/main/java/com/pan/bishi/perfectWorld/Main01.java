package com.pan.bishi.perfectWorld;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/23 - 17:56
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] weight1 = str.split(" ");
        int[] weight = new int[weight1.length];
        for (int i = 0; i < weight1.length; i++) {
            weight[i] = Integer.parseInt(weight1[i]);
        }
        int limit = scanner.nextInt();
        System.out.println(minChuan(weight,limit));

    }

    public static int minChuan(int[] weight, int limit) {
        int result = 0, count = 0;
        int n = weight.length;
        Arrays.sort(weight);
        if (weight[n - 1] <= limit / 2) {
            return weight.length / 2;
        }
        for (int i = 0; i < n - count; i++) {
            if (i == n - count - 1) {
                result++;
                break;
            }
            if (weight[i] != -1) {
                if (weight[i] + weight[n - count - 1] > limit) {
                    if (i > 0) {
                        weight[i - 1] = -1;
                    }
                    i--;
                } else if (weight[i] + weight[n - count - 1] == limit) {
                    weight[i] = -1;
                }
                result++;
                count++;
            }
        }
        return result;
    }
}
