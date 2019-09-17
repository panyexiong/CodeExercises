package com.pan.bishi.baidu;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/17 - 18:54
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        if (n == m) {
            System.out.println(n);
        } else {
            if (n / 2 >= m) {
                System.out.println(n - m);
            } else {
                System.out.println(m);
            }

        }
    }
}
