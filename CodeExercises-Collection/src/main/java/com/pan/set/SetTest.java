package com.pan.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    /*
    1、无序性:不等于随机性；
    2、不可重复性
     */

    @Test
    public void Test(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add("DD");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
