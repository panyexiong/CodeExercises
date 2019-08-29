package com.pan.bishi.xingdongwangluo;

import java.util.*;

/**
 * @author panyexiong
 * @date 2019/8/29 - 18:11
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zidian = scanner.nextLine();
        int num = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            list.add(str);
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < zidian.length(); i++) {
            map.put(zidian.charAt(i), i);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if (len1 == 0) {
                    return -1;
                }
                if (len2 == 0) {
                    return 1;
                }
                if (o1.equals(o2)) {
                    return 0;
                }
                if (len1 >= len2) {
                    if (o1.substring(0, len2).equals(o2)) {
                        return 1;
                    }
                    for (int i = 0; i < len2; i++) {
                        if (map.get(o1.charAt(i)) > map.get(o2.charAt(i))) {
                            return 1;
                        } else if (map.get(o1.charAt(i)) < map.get(o2.charAt(i))) {
                            return -1;
                        } else {
                            continue;
                        }
                    }
                }
                if (len1 < len2) {
                    if (o2.substring(0, len1).equals(o1)) {
                        return -1;
                    }
                    for (int i = 0; i < len1; i++) {
                        if (map.get(o1.charAt(i)) > map.get(o2.charAt(i))) {
                            return 1;
                        } else if (map.get(o1.charAt(i)) < map.get(o2.charAt(i))) {
                            return -1;
                        } else {
                            continue;
                        }
                    }

                }
                return 0;
            }
        });
        for (String string : list) {
            System.out.println(string);
        }
    }
}

