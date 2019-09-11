package com.pan.dataStructure.binaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/10 10:17
 */
public class Node {
    private int data;
    private String name;
    private Node leftChildNode;
    private Node rightChildNode;

    public Node(int number) {
        this.data = number;
    }

    public Node(int number, String name) {
        this.data = number;
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(Node leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(Node rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */

    public void proOrder() {
        System.out.println(this);
        if (this.leftChildNode != null) {
            this.leftChildNode.proOrder();
        }
        if (this.rightChildNode != null) {
            this.rightChildNode.proOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (this.leftChildNode != null) {
            this.leftChildNode.infixOrder();
        }
        System.out.println(this);
        if (this.rightChildNode != null) {
            this.rightChildNode.infixOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        if (this.leftChildNode != null) {
            this.leftChildNode.postOrder();
        }
        if (this.rightChildNode != null) {
            this.rightChildNode.postOrder();
        }
        System.out.println(this);
    }

}
