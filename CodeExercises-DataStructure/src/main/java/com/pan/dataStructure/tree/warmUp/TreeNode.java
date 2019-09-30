package com.pan.dataStructure.tree.warmUp;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/29 17:40
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }
}
