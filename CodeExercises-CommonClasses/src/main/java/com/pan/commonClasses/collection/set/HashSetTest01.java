package com.pan.commonClasses.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 9:45
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Set set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(new User("pan",23));
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
