package com.vlsu.lab06.node.operations;

import com.vlsu.lab06.node.INode;

public class SubstractNode implements INode {
    private final INode leftNode;
    private final INode rightNode;

    public SubstractNode(INode leftNode, INode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int calculate() {
        return leftNode.calculate() - rightNode.calculate();
    }

    public String toString() {
        return "(" + leftNode.toString() + ") - (" + rightNode.toString() + ")";
    }
}
