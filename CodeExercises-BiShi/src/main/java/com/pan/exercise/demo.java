package com.pan.exercise;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 20:41
 */

import java.util.*;

public class demo {
    private static boolean check(Map<Integer, Boolean> m, int minv, int maxv) {
        for (int i = minv; i <= maxv; i++) {
            if (!m.containsKey(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Integer> h = new ArrayList<>();
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(cin.nextInt());
            order.add(i);
        }
        Collections.sort(order, (o1, o2) -> h.get(o1) - h.get(o2));

        Map<Integer, Boolean> m = new HashMap<>();
        int ans = 0;
        int ind = 0;
        int minv = 0;
        int maxv = -1;
        while (ind < n) {
            if (maxv == minv - 1) {
                m.put(order.get(ind), true);
                maxv = order.get(ind);
                if (check(m, minv, maxv)) {
                    ans++;
                    minv = ++ind;
                    maxv = minv - 1;
                } else {
                    ind++;
                }
            } else {
                if (order.get(ind) > maxv) {
                    maxv = order.get(ind);
                    m.put(order.get(ind), true);
                } else {
                    m.put(order.get(ind), true);
                }
                if (check(m, minv, maxv)) {
                    ans++;
                    minv = ++ind;
                    maxv = minv - 1;
                } else {
                    ind++;
                }
            }

        }
        System.out.println(ans);
    }
}
