package com.pan.commonClasses.collection.set;

import java.util.Objects;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/30 10:16
 */
public class User implements Comparable<User>{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 按照姓名排序,姓名相同，比较年龄
     * @param o
     * @return
     */
    @Override
    public int compareTo(User o) {
        int compare = this.name.compareTo(o.name);
        if (compare!=0){
            return compare;
        }else{
            return Integer.compare(this.age,o.age);
        }

    }



}
