package com.pan.bishi.zoom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/22 - 13:27
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        List<Integer> result = fun(num1, num2);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static List<Integer> fun(int total, int k) {
        List<Integer> list = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add(i + 1);
        }
        int index = -1;
        while (list.size() > 1) {
            index = (index + k) % list.size();
            result.add(list.get(index));
            list.remove(index--);
        }
        result.add(list.get(0));
        return result;
    }


}
