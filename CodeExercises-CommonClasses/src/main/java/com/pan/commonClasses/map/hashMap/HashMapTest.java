package com.pan.commonClasses.map.hashMap;

import java.util.*;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 13:23
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 3);
        map.put(4, 2);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Collection collection = map.values();
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        Set set1 = map.entrySet();
        for (Object obj :
                set1) {
            System.out.print(obj + " ");
        }
        System.out.println();


    }
}
