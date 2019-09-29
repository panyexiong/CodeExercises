package com.pan.dataStructure.tree.warmUp;

/**
 * 反转二叉树
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/29 17:39
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        } else {
            return null;
        }
    }
}
