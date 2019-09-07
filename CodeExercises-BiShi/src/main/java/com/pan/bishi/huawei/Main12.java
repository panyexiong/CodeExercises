package com.pan.bishi.huawei;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for (int i = 1; i <= n; i++) {
            num1 *= i;
        }
        for (int i = 1; i <= m; i++) {
            num2 *= i;
        }
        for (int i = 1; i <= n - m; i++) {
            num3 *= i;
        }
        int num = num1 / (num2 * num3);
        int sumNum = 0;
        int sumNum1 = 0;
        if (m == 1) {
            sumNum = 1;
        } else if (m == 2) {
            sumNum = 3;
        } else {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= i ; j++) {
                    sumNum += sum(j);
                }
                System.out.println(sumNum);
                sumNum1 += sumNum;
                sumNum = 0;
            }
        }
        System.out.println(sumNum1);
        System.out.println(sumNum1 * num);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
