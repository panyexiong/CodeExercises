package com.pan.dataStructure.multinomialTree;

import lombok.Data;

import java.util.List;

@Data
public class Node {

    private Integer data;
    private List<Node> nodeList;

    public Node(Integer data, List<Node> nodeList) {
        this.data = data;
        this.nodeList = nodeList;
    }
}
