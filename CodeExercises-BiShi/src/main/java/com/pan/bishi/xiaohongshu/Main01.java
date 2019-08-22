package com.pan.bishi.xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/18 - 14:51
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        String string = scanner.next();
        //商品个数len
        int len = string.length() / 2;
        int[] arr = new int[len];

        for (int i = 0, j = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) != '[' && string.charAt(i) != ',') {
                arr[j] = Integer.parseInt(String.valueOf(string.charAt(i)));
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
