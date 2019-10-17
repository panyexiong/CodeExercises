package com.pan.BinaryTree.BST;

import com.pan.BinaryTree.Node;

import java.util.Comparator;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/17 18:29
 */
public class BinarySearchTree {
    private Node root = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node curNode = root;
        Node parentNode = null;
        while (curNode != null) {
            parentNode = curNode;
            if (curNode.data > data) {
                curNode = curNode.left;
                if (curNode == null) {
                    parentNode.left = newNode;
                    return;
                }
            } else if (curNode.data < data) {
                curNode = curNode.right;
                if (curNode == null) {
                    parentNode.right = newNode;
                    return;
                }
            }
        }


    }


}
