package com.pan.dataStructure.tree.binaryTree;

/**
 * @author panyexiong
 * @date 2019/9/11 - 9:33
 */
public class BinaryTreeTest implements BinaryTree {

    Node root;

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null){
                parentNode = current;
                if(current.getData() > data){
                    current = current.getLeftChildNode();
                    if (current == null){
                        parentNode.setLeftChildNode(newNode);
                        return true;
                    }
                }else {
                    current = current.getRightChildNode();
                    if(current == null){
                        parentNode.setRightChildNode(newNode);
                        return true;
                    }
                }

            }
        }
        return false;
    }

    @Override
    public Node returnRoot() {
        return root;
    }
}
