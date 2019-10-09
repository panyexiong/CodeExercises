package com.pan.bishi.kedaxunfei;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/9 - 19:39
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        if (n%3 == 0){

        }
        int[] arr = new int[100];
        int k = 2;
        int i = 0;
        while (n >= k) {
            arr[i++] = k;
            n -= k;
            k++;
        }
        if (n > 0) {
            if (n == arr[i - 1]) {
                arr[i - 1]++;
                n--;
            }
            for (int j = i - 1; j >= 0 && n > 0; j--) {
                arr[j]++;
                n--;

            }
        }
        int res = 1;
        for (int j = 0; j < i; j++) {
            res *= arr[i];
        }
        return res;
    }
}
