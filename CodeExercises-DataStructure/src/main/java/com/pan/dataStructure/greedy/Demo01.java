package com.pan.dataStructure.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/22 11:28
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建广播电台，放入到map中管理
        HashMap<String, HashSet<String>> broadcasts = new HashMap<>();

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");

        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");

        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("上海");
        hashSet4.add("天津");

        HashSet<String> hashSet5 = new HashSet<>();
        hashSet5.add("杭州");
        hashSet5.add("大连");

        broadcasts.put("k1", hashSet1);
        broadcasts.put("k2", hashSet2);
        broadcasts.put("k3", hashSet3);
        broadcasts.put("k4", hashSet4);
        broadcasts.put("k5", hashSet5);

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("大连");
        allAreas.add("杭州");

        //创建一个ArrayList，存放选择的电台集合
        List<String> list = new ArrayList<>();

        //定义一个临时的集合，在遍历的过程中，存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交际
        HashSet<String> tmpSet = new HashSet<>();

        //定义maxKey，保存在一次遍历中，能够覆盖最大未覆盖的地区对应的电台的key
        String maxKey = null;
        //如果maxKey不为null，则会加入到selects中
        while (allAreas.size() != 0) {

            //bianli
            for (String key : broadcasts.keySet()) {
                HashSet<String> ares = broadcasts.get(key);
                tmpSet.addAll(ares);
                tmpSet.retainAll(allAreas);
                if (tmpSet.size() > 0 && (maxKey == null || tmpSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }
        }


    }
}
