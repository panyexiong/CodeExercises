package com.pan.bishi.tengxun;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 楼量
        int n = scanner.nextInt();
        // 定义楼高度数组
        int[] w = new int[n];
        // 接受楼的高度
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        // 计算能看到楼的数量
        for (int i = 0; i < n; i++) {
            // 包含自身所在的大楼 1
            int count = 1;
            // 向前 从0开始
            int[] intF = Arrays.copyOfRange(w, 0, i);
            count += count2(intF);
            // 前后 从i开始
            int[] intB = Arrays.copyOfRange(w, i, n);
            count += count(intB);
            // 输出
            System.out.print(count + " ");
        }
    }

    public static int count(int[] w) {
        if (w.length == 0) {
            return 0;
        }
        // 第一个肯定能看到
        int result = 1;
        int firstW = w[0];
        for (int i = 1; i < w.length; i++) {
            // 如果后面的比这个大 才能看到
            if (w[i] > firstW) {
                result++;
                firstW = w[i];
            }
        }
        return result;
    }

    public static int count2(int[] w) {
        if (w.length == 0) {
            return 0;
        }
        // 第一个肯定能看到
        int result = 1;
        int firstW = w[w.length - 1];
        for (int i = w.length - 2; i >= 0; i--) {
            // 如果前面的比这个大 才能看到
            if (w[i] > firstW) {
                result++;
                firstW = w[i];
            }
        }
        return result;
    }

}
