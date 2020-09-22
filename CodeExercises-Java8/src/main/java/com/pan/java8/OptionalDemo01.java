package com.pan.java8;

import com.pan.java8.entity.Person;
import org.junit.Test;

import java.util.Optional;

public class OptionalDemo01 {

    @Test
    public void test1() {
        Person person  = new Person();
        person.setAge(24);
        Optional.ofNullable(person).get();
        System.out.println();
    }
}
