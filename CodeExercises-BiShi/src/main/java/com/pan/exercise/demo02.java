package com.pan.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 20:53
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] acopy = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            acopy[i] = a[i];
        }
        Arrays.sort(a);
        int max = 0;
        int cnt = 0;
        //int num = 0;
        for (int i = 0; i < n; i++) {
            if (acopy[i] > max) {
                max = acopy[i];
            }
            //num++;
            if (a[i] == max) {
                //if (num >= 2) {
                cnt++;
                // num = 0;
                //}

            }
        }
        System.out.println(cnt);

    }
}

