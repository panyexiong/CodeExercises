package com.pan.reflect.demo02;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 21:29
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Person person = new Person("pan", 23);
        Class personClass1 = person.getClass();
        Class<Person> personClass2 = Person.class;
        Class<Person> personClass = (Class<Person>) Class.forName("com.pan.reflect.demo02.Person");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            String key = field.getName();
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor(key, personClass);
            Method method = propertyDescriptor.getReadMethod();
            Object value = method.invoke(person);

            System.out.println(key + ":" + value);
        }
    }
}
