package com.pan.exercise;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 11:32
 */
public class Demo002 {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(string.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
