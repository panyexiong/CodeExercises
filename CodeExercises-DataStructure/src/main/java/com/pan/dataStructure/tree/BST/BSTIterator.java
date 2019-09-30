package com.pan.dataStructure.tree.BST;

import com.pan.dataStructure.tree.warmUp.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/29 17:34
 */
public class BSTIterator {
    private Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        iterator = list.iterator();
    }

    private void inOrder(TreeNode p, ArrayList<Integer> list) {
        if(p!=null){
            inOrder(p.left,list);
            list.add(p.val);
            inOrder(p.right,list);
        }

    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public int next() {
        return iterator.next();
    }

}
