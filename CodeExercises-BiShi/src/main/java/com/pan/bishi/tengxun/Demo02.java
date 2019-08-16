package com.pan.bishi.tengxun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        String str = scanner.next();
//        int[] arr =new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = scanner.nextInt();
//        }
        char[] char1 = str.toCharArray();
        for (int i = 0; i < char1.length / 2; i++) {
            char temp = char1[i];
            char1[i] = char1[char1.length - 1 - i];
            char1[char1.length - 1 - i] = temp;
        }
        for (int i = 0; i < char1.length; i++) {
            System.out.print(char1[i]);

        }
    }
}
