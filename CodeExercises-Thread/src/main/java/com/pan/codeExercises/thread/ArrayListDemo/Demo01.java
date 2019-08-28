package com.pan.codeExercises.thread.ArrayListDemo;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合不安全问题
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 16:40
 */
public class Demo01 {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
