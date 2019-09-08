package com.pan.bishi.hkws;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/8 18:31
 */
public class xuanze {
    public static void main(String[] args) {
        A a= new A();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println(a.show(b) + " "+a.show(c)+" "+a.show(d)+b.show(a)+b.show(c)+b.show(d));
    }
}

class A{
    public String show(D d){
        return "AD";
    }
    public String show(A a){
        return "AA";
    }
}
class B extends A{
    public String show(B b){
        return "BB";
    }
    public String show(A a){
        return "BA";
    }
}

class C extends B{}
class D extends B{}
