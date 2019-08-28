package com.pan.codeExercises.singletonDemo;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 10:23
 */
public class SingletonDemo01 {
    private static volatile SingletonDemo01 instance =null;

    private SingletonDemo01() {
        System.out.println("执行了构造方法！！！");
    }

    public static SingletonDemo01 getInstance(){
        if (instance == null){
            synchronized (SingletonDemo01.class){
                if (instance == null){
                    instance = new SingletonDemo01();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                SingletonDemo01.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
