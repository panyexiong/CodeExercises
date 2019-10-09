package com.pan.bishi.kedaxunfei;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/9 - 19:39
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n == 2) {
            System.out.println(1);
            return;
        }
        if (n == 3) {
            System.out.println(2);
            return;
        }
        int res = 1;
        while (n > 4) {
            res *= 3;
            n -= 3;
        }
        System.out.println(res * n);
    }
}
