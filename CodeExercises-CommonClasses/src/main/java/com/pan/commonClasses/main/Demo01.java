package com.pan.commonClasses.main;

/**
 * 代码块
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 10:21
 */
public class Demo01 {
    public static void main(String[] args) {
        String desc = Person.desc;

        Person person1 = new Person();
        Person person2 = new Person();
    }
}
class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    //构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态代码块
    static{
        System.out.println("这是静态代码块");
        desc = "我是一个爱学习的人";
    }
    //非静态代码块
    {
        System.out.println("这是非静态代码块");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public static void info(){
        System.out.println("我是一个快乐的人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}