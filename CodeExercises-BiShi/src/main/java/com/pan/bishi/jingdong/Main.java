package com.pan.bishi.jingdong;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 20:41
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> high = new ArrayList<>();
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            high.add(scanner.nextInt());
            order.add(i);
        }
        Collections.sort(order, (o1, o2) -> high.get(o1) - high.get(o2));

        Map<Integer, Boolean> map = new HashMap<>();
        int num1 = 0;
        int index = 0;
        int minValue = 0;
        int maxValue = -1;
        while (index < num) {
            if (maxValue == minValue - 1) {
                map.put(order.get(index), true);
                maxValue = order.get(index);
                if (checkContain(map, minValue, maxValue)) {
                    num1++;
                    minValue = ++index;
                    maxValue = minValue - 1;
                } else {
                    index++;
                }
            } else {
                if (order.get(index) > maxValue) {
                    maxValue = order.get(index);
                    map.put(order.get(index), true);
                } else {
                    map.put(order.get(index), true);
                }
                if (checkContain(map, minValue, maxValue)) {
                    num1++;
                    minValue = ++index;
                    maxValue = minValue - 1;
                } else {
                    index++;
                }
            }

        }
        System.out.println(num1);
    }

    private static boolean checkContain(Map<Integer, Boolean> m, int minValue, int maxValue) {
        for (int i = minValue; i <= maxValue; i++) {
            if (!m.containsKey(i)) {
                return false;
            }
        }
        return true;
    }
}
