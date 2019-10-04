package com.pan.mashibing.Demo025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/4 16:41
 */
public class T03_SynchronizedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listSync = Collections.synchronizedList(list);
    }
}
