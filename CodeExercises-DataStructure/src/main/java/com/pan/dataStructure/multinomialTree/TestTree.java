package com.pan.dataStructure.multinomialTree;

import org.junit.Test;

import java.util.List;

public class TestTree {

    @Test
    public void test1(){

    }

    public boolean fun(Node node){
        if (node.getNodeList().contains(node.getData())){
            return false;
        }
        List<Node> nodeList = node.getNodeList();
        for (int i = 0; i < nodeList.size(); i++) {
            fun(nodeList.get(i));
        }
        return false;
    }
}
