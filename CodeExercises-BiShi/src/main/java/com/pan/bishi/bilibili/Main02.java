package com.pan.bishi.bilibili;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/10 - 19:36
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(fun(str1,str2));
    }

    public static int fun(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] arr = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            arr[i][0] = i;
        }
        for (int i = 0; i <= len2; i++) {
            arr[0][i] = i;
        }
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    arr[i+1][j+1] = arr[i][j];

                }else {
                    int add = arr[i][j+1];
                    int delete = arr[i+1][j];
                    int rep = arr[i][j];
                    arr[i+1][j+1] = Math.min(Math.min(add,delete),rep)+1;
                }
            }
        }
        return arr[len1][len2];
    }
}
