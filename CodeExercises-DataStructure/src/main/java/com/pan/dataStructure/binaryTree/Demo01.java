package com.pan.dataStructure.binaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/10 10:16
 */
public class Demo01 {


    public static void main(String[] args) {
        BinaryTreeTest binaryTreeTest = new BinaryTreeTest();
        binaryTreeTest.insert(4);
        binaryTreeTest.insert(2);
        binaryTreeTest.insert(3);
        binaryTreeTest.insert(6);
        binaryTreeTest.insert(1);
        binaryTreeTest.insert(8);
        binaryTreeTest.insert(5);

        Node node = binaryTreeTest.returnRoot();
        System.out.println("=====中序遍历=====");
        node.proOrder();
        System.out.println("=====先序遍历=====");
        node.infixOrder();
        System.out.println("=====后序遍历=====");
        node.postOrder();
    }
}
