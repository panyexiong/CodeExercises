package com.pan.bishi.wubatongcheng;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author panyexiong
 * @date 2019/9/12 - 20:25
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(",");
        int[] arr = new int[strs.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.valueOf(strs[i]);
            set.add(Integer.valueOf(strs[i]));
        }
        System.out.println(set.size());
    }
}
