package com.pan.commonClasses.string;


import java.util.ArrayList;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/12 17:46
 */
public class Demo02_String extends Test{
    Test test;
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList clone = (ArrayList) list1.clone();
        System.out.println(clone.getClass()==list1.getClass());
        System.out.println(clone.getClass().getName());
        System.out.println(new Integer(1).hashCode());
        System.out.println(new String("12").hashCode());
        System.out.println(new Boolean(true).hashCode());

    }

}

class Test {
    static {
        System.out.println("静态代码块执行！！！");
    }
}