package com.pan.commonClasses.collection.set;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 11:03
 */
public class mianshiti {

    /**
     * 在list中去除重复数字值
     */
    @Test
    public void test01(){
        HashSet set = new HashSet();
        List list =  new ArrayList();
        set.addAll(list);
        ArrayList result = new ArrayList(set);
    }


    @Test
    public void test02(){
        HashSet set =new HashSet();
        Person p1 =new Person(1001,"AA");
        Person p2 =new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        //由于p1的name修改了，所以根据现在p1的属性 id=1001，name=“CC”计算的hash值找的不是到原来的索引位置，现在的位置上大概率为null，所以删除失败。
        boolean remove = set.remove(p1);
        System.out.println(remove);
        System.out.println(set);

        //这一步添加对象时，根据id=1001,name="CC"计算的hash值，不等于原来的id=1001,name="AA"的hash值，所以两个对象不会放在同一个地址，不会覆盖。
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        //这一步根据id=1001,name="AA"计算的hash值,等于原来的根据id=1001,name="AA"的hash值，但是此时两个对象中的属性值不一样，前者对象的的name="CC"，此时的新添加的对象的name="AA",所以不会覆盖。
        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }
}
