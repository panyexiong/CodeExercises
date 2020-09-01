package com.pan.commonClasses.Collections;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {

    @Test
    public void test1() {
        ArrayList<String> list1 = null;

        System.out.println(list1);
        list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        System.out.println(list1);

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s3Upper = s3.toUpperCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
