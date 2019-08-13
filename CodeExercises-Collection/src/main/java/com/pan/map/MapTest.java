package com.pan.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 双列数据，存储key-value数据
 */
public class MapTest {

    @Test
    public void test01(){
        Map map = new HashMap();
        map.put(null,null);
        Map map1 = new Hashtable();
        map1.put(1,1);
    }
}
