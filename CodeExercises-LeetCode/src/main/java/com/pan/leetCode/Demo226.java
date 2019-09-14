package com.pan.leetCode;


/**
 * 反转二叉树
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 10:47
 */
public class Demo226 {

    public static TreeNode invertTree(TreeNode root) {
        if (root != null){
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }else {
            return null;
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

