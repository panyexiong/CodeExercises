package com.pan.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉排序树
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 18:23
 */
public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    /**
     * 插入节点
     *
     * @param data
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node curNode = root;
            Node parent = null;
            while (true) {
                parent = curNode;
                if (data < curNode.data) {
                    curNode = curNode.left;
                    if (curNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    curNode = curNode.right;
                    if (curNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 将数组构建成二叉树
     *
     * @param data
     */
    public void buildTree(int[] data) {
        for (int i = 0; i < data.length; i++) {
            insert(data[i]);
        }
    }

    /**
     * 先序遍历
     *
     * @param root
     */
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void preOrder() {
        this.preOrder(root);
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void inOrder() {
        this.inOrder(root);
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void postOrder() {
        this.postOrder(root);
    }

    /**
     * 层序遍历二叉树
     */
    public void layerTranverse() {
        if (root == null) {
            return;
        }
        List<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = ((LinkedList<Node>) queue).pop();
            System.out.print(node.data+" ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
