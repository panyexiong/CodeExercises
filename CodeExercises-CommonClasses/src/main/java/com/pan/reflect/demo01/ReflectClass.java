package com.pan.reflect.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/5 11:57
 */
public class ReflectClass {
    private final static String TAG = "com.pan.reflect.demo01.ReflectClass";

    public static void reflectNewInstance(){
        try {
            Class<?> classBook = Class.forName("com.pan.reflect.demo01.Book");
            Book book = (Book) classBook.newInstance();
            book.setName("Java反射");
            book.setAuthor("pan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
