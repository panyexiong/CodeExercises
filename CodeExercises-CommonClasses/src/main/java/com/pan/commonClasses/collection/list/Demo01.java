package com.pan.commonClasses.collection.list;

import org.junit.Test;

import java.util.*;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/29 21:44
 */
public class Demo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 =  Collections.synchronizedList(new ArrayList());
        List Vector = new Vector();
        list.add(1);

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);

        Vector vector = new Vector();
        vector.add(1);
    }

    @Test
    public void testListRemove(){
        List list = new ArrayList();
        //add中的数值自动装箱，按顺序存值
        list.add(1);
        list.add(2);
        list.add(3);
        //remove方法按索引位置删除值
        list.remove(2);
        //手动装箱，删除2
        list.remove(new Integer(2));
        System.out.println(list);
    }
}
