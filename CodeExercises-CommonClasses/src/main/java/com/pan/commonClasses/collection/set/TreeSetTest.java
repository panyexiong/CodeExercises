package com.pan.commonClasses.collection.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 10:37
 */
public class TreeSetTest {

    @Test
    public void test01(){
        Set<User> set = new TreeSet<>();

        set.add(new User("pan",23));
        set.add(new User("zhang",19));
        set.add(new User("Tom",21));
        set.add(new User("zhang",20));

        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test02(){
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Set<User> set = new TreeSet<>(comparator);

        set.add(new User("pan",23));
        set.add(new User("zhang",19));
        set.add(new User("Tom",21));
        set.add(new User("zhang",20));

        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
