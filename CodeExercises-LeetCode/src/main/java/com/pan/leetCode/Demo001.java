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
        if (nums == null || nums.length < 2){
            return null;
        }
        int[] res = new int[]{-1,-1};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
