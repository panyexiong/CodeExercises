package com.pan.bishi.tengxun.tx02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/1 - 19:55
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bxNum = scanner.nextInt();
        int ysNum = scanner.nextInt();
        int[] baoxiang = new int[bxNum];
        int[] yaoshi = new int[ysNum];
        List<Integer> bxList = new ArrayList<>();
        List<Integer> ysList = new ArrayList<>();

//        for (int i = 0; i < bxNum; i++) {
//            baoxiang[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < ysNum; i++) {
//            yaoshi[i] = scanner.nextInt();
//        }
        for (int i = 0; i < bxNum; i++) {
            bxList.add(scanner.nextInt());
        }
        for (int i = 0; i < ysNum; i++) {
            ysList.add(scanner.nextInt());
        }
        //打开宝箱数量
        int num = 0;
        for (int i = 0; i < bxList.size(); i++) {
            if (ysList.size() == 0 || bxList.size() == 0){
                break;
            }
            for (int j = 0; j < ysList.size(); j++) {
                int sum = bxList.get(i) + ysList.get(j);
                if (sum % 2 == 1) {
                    num++;
//                    bxList.remove(i);
                    ysList.remove(j);
                    break;
                }
            }
        }
        System.out.println(num);

    }
}
