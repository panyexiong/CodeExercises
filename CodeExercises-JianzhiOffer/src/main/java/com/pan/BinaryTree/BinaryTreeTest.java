package com.pan.BinaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 18:45
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int[] arr = {1, 5, 8, 3, 0, 4, 9, -1};
        binaryTree.buildTree(arr);
        System.out.println("先序遍历");
        binaryTree.preOrder();
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrder();
        System.out.println();
        System.out.println("后序遍历");
        binaryTree.postOrder();
        System.out.println();
        System.out.println("层序遍历");
        binaryTree.layerTranverse();
    }

}
