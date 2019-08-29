package com.pan.bishi.xingdongwangluo;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/29 - 18:11
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(i,0);
        }

        int[][] arr2 = new int[num-1][2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = scanner.nextInt();
                if (map.containsKey(arr2[i][j])){
                    map.put(arr2[i][j],map.get(arr2[i][j])+1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println(map);



    }
}
