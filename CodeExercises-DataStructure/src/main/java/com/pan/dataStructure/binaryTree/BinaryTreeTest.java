package com.pan.dataStructure.binaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/28 20:20
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(2);
        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(4);
        binaryTree.insert(9);
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(6);
        binaryTree.insert(5);

        binaryTree.preOrder();
        System.out.println("======");
        binaryTree.postOrder();
        System.out.println("======");
        binaryTree.inOrder();
        System.out.println("======");
        binaryTree.layerTranverse();
    }
}
