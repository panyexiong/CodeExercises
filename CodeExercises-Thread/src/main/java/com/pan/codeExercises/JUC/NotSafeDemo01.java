package com.pan.codeExercises.JUC;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/1 13:18
 */
public class NotSafeDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List<String> list1 = Collections.synchronizedList(new ArrayList<>());
        List<String> list2 = new CopyOnWriteArrayList<>();
        Map<String,String> map = new ConcurrentHashMap<>();




        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                list2.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list2);
            },String.valueOf(i)).start();
        }
    }
}
