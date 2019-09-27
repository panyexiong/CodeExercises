package com.pan.bishi.wangyihuyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/27 - 20:06
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        String[] strings = new String[num];
        for (int i = 0; i < num; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < num; i++) {
//            System.out.println(fun1(strings[i],reverse(strings[i])));
            System.out.println(Math.min(fun(strings[i]), fun1(strings[i],reverse(strings[i]))));
        }
    }

    public static int fun(String string) {
        if (string.length() == 1) {
            return 0;
        }
        char[] chars = string.toCharArray();
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            map.put(chars[i], 1);
//        }
//        if (map.size() <= string.length()) {
//            return map.size() - 1;
//        }

        Map<Character, Integer> map1 = new HashMap<>();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!map1.containsKey(chars[i])) {
                map1.put(chars[i], count++);
            }
        }
//        System.out.println("===" + map1);

        int sum = 0;
        for (int i = 0; i < string.length() - 1; i++) {

            sum += Math.abs(map1.get(chars[i + 1]) - map1.get(chars[i]));

        }
        return sum;
    }

    public static int fun1(String string,String reverse) {
        if (string.length() == 1) {
            return 0;
        }
        char[] chars = string.toCharArray();
        char[] chars2 = reverse.toCharArray();


        Map<Character, Integer> map1 = new HashMap<>();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!map1.containsKey(chars2[i])) {
                map1.put(chars2[i], count++);
            }
        }
//        System.out.println("===" + map1);

        int sum = map1.get(chars[0]);
        for (int i = 0; i < string.length() - 1; i++) {

            sum += Math.abs(map1.get(chars[i + 1]) - map1.get(chars[i]));

        }
        return sum;
    }

    public static String reverse(String string) {
        char[] chars = string.toCharArray();
        String str = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            str += chars[i];
        }
        return str;
    }
}
