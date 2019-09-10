package com.pan.bishi.bilibili;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/10 - 18:44
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        n *= 2;
        int num = 0;
        for (int i = (int) Math.sqrt(n); i > 0; --i) {
            if (n % i == 0) {
                int b = (n / i + i - 1) / 2;
                int a = b - n / i + 1;
                if ((a + b) * (b - a + 1) == n) {
                    ++num;
                }
            }
        }
        return num;
    }
}
