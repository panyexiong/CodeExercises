package com.pan.BinaryTree;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 18:22
 */
public class Node implements Comparable<Integer> {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(Integer o) {
        if (this.data > o){
            return 1;
        }else if (this.data == o){
            return 0;
        }else {
            return -1;
        }
    }
}
