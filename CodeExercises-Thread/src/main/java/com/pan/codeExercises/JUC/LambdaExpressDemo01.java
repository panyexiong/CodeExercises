package com.pan.codeExercises.JUC;

@FunctionalInterface
interface Foo {

    int add(int x, int y);

    default int mul(int x, int y){
        return x*y;
    }

    static int div(int x,int y){
        return x/y;
    }
}

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/1 13:09
 */
public class LambdaExpressDemo01 {

}
