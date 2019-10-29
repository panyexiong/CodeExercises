package com.pan.mianshi.wangyihuyu;

import java.util.*;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/23 16:26
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 10;
        List<List<Integer>> lists = combinationSum2(candidates, target);
        Iterator<List<Integer>> iterators = lists.iterator();
        int max = 0;
        while (iterators.hasNext()) {
            List<Integer> list = iterators.next();
            Iterator<Integer> iterator = list.iterator();
            int chengji = 1;
            while (iterator.hasNext()) {
                chengji *= iterator.next();
            }
            max = Math.max(max, chengji);
        }
        System.out.println(lists);
        System.out.println(max);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Arrays.sort(candidates);
        findCombinationSum2(candidates, 0, len, target, new Stack<>(), res);
        return res;
    }

    private static void findCombinationSum2(int[] candidates, int begin, int len, int residue, Stack<Integer> stack, List<List<Integer>> res) {
        if (residue == 0) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = begin; i < len && residue - candidates[i] >= 0; i++) {
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            stack.add(candidates[i]);
            findCombinationSum2(candidates, i + 1, len, residue - candidates[i], stack, res);
            stack.pop();
        }

    }
}
