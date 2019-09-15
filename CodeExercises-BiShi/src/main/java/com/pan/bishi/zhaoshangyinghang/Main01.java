package com.pan.bishi.zhaoshangyinghang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'L') {
                list.add(i);
            }
        }
        int[] arr = new int[string.length()];
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                if (list.get(i) % 2 == 1) {
                    arr[list.get(i)] = arr[list.get(i) - 1] = (list.get(i) + 1) / 2;
                } else {
                    arr[list.get(i)] = list.get(i) / 2 + 1;
                    arr[list.get(i) - 1] = list.get(i) / 2;
                }
            } else {
                if ((list.get(i) - list.get(i - 1) - 1) % 2 == 1) {
                    arr[list.get(i)] = arr[list.get(i) - 1] = (list.get(i) - list.get(i - 1)) / 2;
                } else {
                    arr[list.get(i)] = (list.get(i) - list.get(i - 1) - 1) / 2 + 1;
                    arr[list.get(i) - 1] = (list.get(i) - list.get(i - 1) - 1) / 2;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
