package com.pan.commonClasses.map.TreeMapTest;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 20:05
 */
public class Demo01 {

    /**
     * 自然排序
     */
    @Test
    public void test01() {
        //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
        TreeMap<User, Integer> treeMap = new TreeMap<>();

        User user1 = new User("Tom", 21);
        User user2 = new User("Jerry", 32);
        User user3 = new User("Jack", 18);
        User user4 = new User("Rose", 41);
        treeMap.put(user1, 98);
        treeMap.put(user2, 89);
        treeMap.put(user3, 70);
        treeMap.put(user4, 92);

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 定制排序
     */
    @Test
    public void test02() {
        TreeMap<User, Integer> treeMap = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });

        User user1 = new User("Tom", 21);
        User user2 = new User("Jerry", 32);
        User user3 = new User("Jack", 18);
        User user4 = new User("Rose", 41);
        treeMap.put(user1, 98);
        treeMap.put(user2, 89);
        treeMap.put(user3, 70);
        treeMap.put(user4, 92);

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
