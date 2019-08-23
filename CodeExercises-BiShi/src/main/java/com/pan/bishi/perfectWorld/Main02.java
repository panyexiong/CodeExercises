package com.pan.bishi.perfectWorld;

import java.util.*;

/**
 * @author panyexiong
 * @date 2019/8/23 - 19:13
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] strings1 = s1.split(" ");
        int[][] arr = new int[strings1.length][strings1.length];
        for (int i = 0; i < strings1.length; i++) {
            arr[0][i] = Integer.parseInt(strings1[i]);
        }
        for (int i = 1; i < strings1.length; i++) {
            for (int j = 0; j < strings1.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        int length = strings1.length;
        Set<Integer> shortLen = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int[] result = new int[length];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i][j] > 0){
                    list.add(j);
                }
            }
            for (int j = 0; j < list.size(); j++) {

            }
        }
    }
}
