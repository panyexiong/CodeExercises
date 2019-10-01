package com.pan.dataStructure.tree.BST;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 10:40
 */
public class Demo01 {
    private Random random = new Random();
    private final int MAX1 = 16;

    /**
     * 测试插入和迭代
     */
    @Test
    public void test1() {
        AVLMap<Integer, String> map = new AVLMap<>();
        for (int i = 0; i < MAX1; i++) {
            map.put(random.nextInt(MAX1), random.nextInt(MAX1) + "");
        }
        Iterator<AVLEntry<Integer, String>> iterator = map.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().key + " ");
        }
    }

    private final int MAX2 = 66535;

    @Test
    public void test2() {
        AVLMap<Integer, String> map1 = new AVLMap<>();
        TreeMap<Integer, String> map2 = new TreeMap<>();
        for (int i = 0; i < MAX2; i++) {
            int key = random.nextInt(MAX2);
            String value = random.nextInt(MAX2) + "";
            map1.put(key, value);
            map2.put(key, value);
        }
        Assert.assertTrue(map1.size() == map2.size());
        System.out.println(map1.size());
        Iterator<AVLEntry<Integer, String>> iterator1 = map1.iterator();
        Iterator<Map.Entry<Integer, String>> iterator2 = map2.entrySet().iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            Assert.assertTrue(iterator1.next().getKey().equals(iterator2.next().getKey()));
        }
        Assert.assertTrue(!iterator1.hasNext() && !iterator2.hasNext());
    }

    @Test
    public void test3() {
        AVLMap<Integer, String> map = new AVLMap<>();
        map.put(4, "a");
    }
}
