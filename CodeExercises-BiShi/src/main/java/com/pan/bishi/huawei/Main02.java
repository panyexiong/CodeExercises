package com.pan.bishi.huawei;

import jdk.nashorn.internal.ir.IfNode;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

/**
 * @author panyexiong
 * @date 2019/9/4 - 20:07
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strings = new String[num + 1];
        String[] strings1 = new String[num];
        if (scanner.hasNext()) {
            for (int i = 0; i < num + 1; i++) {
                strings[i] = scanner.nextLine();
            }
        }
        for (int i = 1; i < num + 1; i++) {
            strings1[i - 1] = strings[i].trim();
        }
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < num - 1; i++) {
            String str = strings1[i];
            String str1 = "";
            String str2 = "";
            for (int j = 0; j < str.length(); j++) {
                if ('=' == (str.charAt(j))) {
                    str1 = str.substring(0, j).trim();
                    str2 = str.substring(j + 1, str.length()).trim();
                    map.put(str1, str2);
                    break;
                }
            }
        }
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strings1[num - 1].length(); i++) {
            String str = strings1[num - 1];
            String str1 = "";
            String str2 = "";
            String str3 = "";
            if ('=' == (str.charAt(i))) {
                str1 = str.substring(0, i).trim();
                str2 = str.substring(i + 1, str.length()).trim();
                System.out.println(str2);
                String[] split = str2.split("\\+");
                System.out.println(split.length);
                for (int j = 0; j < split.length; j++) {
                    System.out.println(split[j]);
                    for (int k = 0; k < split[j].length(); k++) {
                        if ('=' == split[j].charAt(k)){
                            str3 = split[j].substring(0,k-1);
                            split[j] = str3;
                        }
                    }
                    System.out.println(split[j]);

                    list.add(split[j]);
                }
                break;
            }
        }
        System.out.println(list);
        System.out.println(map);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String value = "";
            if (map.containsKey(list.get(i))) {
                value = map.get(list.get(i));
                System.out.println(value);
                if (value.length() == 1){
                    if (Character.isDigit(value.charAt(0))){
                        list1.add(Integer.valueOf(value.charAt(0)));
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        System.out.println(sum);

    }
}
