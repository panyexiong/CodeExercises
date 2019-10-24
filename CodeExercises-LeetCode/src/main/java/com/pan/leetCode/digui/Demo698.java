package com.pan.leetCode.digui;

/**
 * 划分为k个相等的子集
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/24 10:24
 */
public class Demo698 {
    public static void main(String[] args) {

    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0, maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }
        if (sum % k != 0 || maxNum > sum / k) {
            return false;
        }
        boolean[] used = new boolean[nums.length];
        return backtracking(nums, k, sum / k, 0, 0, used);


    }

    private boolean backtracking(int[] nums, int k, int target, int cur, int start, boolean[] used) {
        // 返回条件
        if (k == 0) {
            return true;
        }
        if (cur == target) {
            // 构建下一个集合
            return backtracking(nums, k - 1, target, 0, 0, used);
        }
        for (int i = start; i < nums.length; i++) {
            if (!used[i] && cur + nums[i] <= target) {
                used[i] = true;
                if (backtracking(nums, k, target, cur + nums[i], i + 1, used)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}

