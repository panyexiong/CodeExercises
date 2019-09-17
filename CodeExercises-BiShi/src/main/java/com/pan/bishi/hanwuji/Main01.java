package com.pan.bishi.hanwuji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/17 - 16:43
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n * 2 + 1];
        String[] strings1 = new String[n];

        for (int i = 0; i < n * 2 + 1; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 1; i < n * 2 + 1; i += 2) {
            if (fun(strings[i], strings[i + 1])) {
                strings1[i / 2] = "SUB";
                System.out.println("SUB");
            } else {
                strings1[i / 2] = "NO";
                System.out.println("NO");
            }
        }



    }

    /**
     * 判断str1是否包含str2
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean fun(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        if (str1.length() == str2.length()) {
            return str2.equals(str1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    list.add(j);
                    break;
                }
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
