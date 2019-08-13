package com.pan.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void test01(){
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(123);
        list.add(new Person("tom",20));
        list.add(false);
        Iterator iterator = list.iterator();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(iterator.next());
//        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
