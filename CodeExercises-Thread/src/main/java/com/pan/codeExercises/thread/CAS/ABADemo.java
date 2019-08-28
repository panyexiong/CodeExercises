package com.pan.codeExercises.thread.CAS;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 15:26
 */
public class ABADemo {
    public static void main(String[] args) {

        User zhangsan = new User("zhangsan",22);
        User lisi = new User("lisi",20);

        //原子引用
        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(zhangsan);
        boolean b1 = atomicReference.compareAndSet(zhangsan, lisi);
        System.out.println(b1+"\t"+atomicReference.get().toString());
        boolean b2 = atomicReference.compareAndSet(zhangsan, lisi);
        System.out.println(b2+"\t"+atomicReference.get().toString());
    }
}


class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
