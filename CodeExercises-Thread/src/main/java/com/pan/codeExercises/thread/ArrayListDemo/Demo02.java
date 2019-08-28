package com.pan.codeExercises.thread.ArrayListDemo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 19:25
 */
public class Demo02 {
    public static void main(String[] args) {
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
        new HashSet<>().add("a");

        Map<String,String> map = new ConcurrentHashMap<>();
    }
}
