package com.pan.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 20:04
 */
public class Demo001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
