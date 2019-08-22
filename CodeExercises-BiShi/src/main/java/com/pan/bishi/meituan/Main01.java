package com.pan.bishi.meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/22 - 14:57
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!list.contains(chars[i])) {
                list.add(chars[i]);
            }
        }
        int[] arr0 = new int[list.size()];
        int[] arr1 = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int flag = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == list.get(i)) {
                    flag++;
                    if (flag == 1) {
                        arr0[i] = j;
                    } else {
                        arr0[i] = Math.min(arr0[i], j);
                    }
                    arr1[i] = Math.max(arr1[i], j);
                }
            }
        }

        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));
        List<Integer> list1 = new ArrayList<>();

        int arr1Index = 0;
        int flag1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr1[arr1Index]) {
                flag1++;
                if (arr0[i] < arr1[arr1Index]) {
                    arr1Index = i;
                    flag1++;
                    continue;
                }
                if (arr0[i] > arr1[arr1Index]) {
                    if (flag1 != 1) {
                        list1.add(arr1[i - 1] + 1);
                        flag1 = 0;
                    }
                    continue;
                }
            }

        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

    }
}
//MPMPCPMMCDEFEGDEHINHKLIN