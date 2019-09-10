package com.pan.dataStructure.binaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/10 10:17
 */
public class Node {
    private int number;
    private String name;
    private Node leftChildNode;
    private Node rightChildNode;

    public Node(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
                "number=" + number +
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
}
