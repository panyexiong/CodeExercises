package com.pan.commonClasses.string;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/12 17:46
 */
public class Demo02_String {
    public static void main(String[] args) {
        String string1 = "123";
        String string2 = new String("1234");


        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("21312");
        System.out.println(stringBuilder2.length());

        StringBuffer stringBuffer = new StringBuffer();
    }
}
