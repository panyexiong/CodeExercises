package com.pan.commonClasses.Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 20:20
 */
public class Demo01 {
    @Test
    public void test01(){
        List list = new ArrayList();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(8);

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.swap(list,1,2);

        Collections.frequency(list,1);


    }
    @Test
    public void test02(){

    }
    @Test
    public void test03(){

    }
    @Test
    public void test04(){

    }
    @Test
    public void test05(){

    }
}
