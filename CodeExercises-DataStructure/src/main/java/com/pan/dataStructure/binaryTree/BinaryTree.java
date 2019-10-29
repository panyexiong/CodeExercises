package com.pan.dataStructure.binaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/28 20:11
 */
public class BinaryTree {
    public Node root = null;


    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node curNode = root;
            Node parent;
            while (true) {
                parent = curNode;
                if (data < curNode.data) {
                    curNode = parent.leftChildNode;
                    if (curNode == null) {
                        parent.leftChildNode = newNode;
                        return;
                    }
                } else {
                    curNode = parent.rightChildNode;
                    if (curNode == null) {
                        parent.rightChildNode = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 先序遍历
     */
    public void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data);
            preOrder(root.leftChildNode);
            preOrder(root.rightChildNode);
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.leftChildNode);
            postOrder(root.rightChildNode);
            System.out.println(root.data);
        }
    }

    public void postOrder() {
        postOrder(this.root);
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.leftChildNode);
            System.out.println(root.data);
            inOrder(root.rightChildNode);
        }
    }

    public void inOrder() {
        inOrder(this.root);
    }

    /**
     * 中序遍历:使用队列
     *
     * @param root
     */
    public void layerTranverse(Node root) {
        if (root == null) {
            return;
        }
        List<Node> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            Node curNode = ((LinkedList<Node>) list).pop();
            System.out.println(curNode.data);
            if (curNode.leftChildNode != null) {
                list.add(curNode.leftChildNode);
            }
            if (curNode.rightChildNode != null) {
                list.add(curNode.rightChildNode);
            }
        }
    }

    public void layerTranverse() {
        layerTranverse(this.root);
    }
}
