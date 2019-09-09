package com.pan.bishi.qianxin;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/9 - 19:40
 */
public class Main02 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        int n = scanner.nextInt();

        String[] strings1 = line1.split(" ");
        int[] arr1 = new int[strings1.length];
        for (int i = 0; i < strings1.length; i++) {
            arr1[i] = Integer.valueOf(strings1[i].trim());
        }

        String[] strings2 = line2.split(" ");
        int[] arr2 = new int[strings2.length];
        for (int i = 0; i < strings2.length; i++) {
            arr2[i] = Integer.valueOf(strings2[i].trim());
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == n) {
                fun(arr1, arr2, arr1[i]);
            }
        }
        System.out.println(count+1);

    }

    public static void fun(int[] arr1, int[] arr2, int num) {
        count++;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == num) {
                fun(arr1, arr2, arr1[i]);
            }
        }
    }
}
