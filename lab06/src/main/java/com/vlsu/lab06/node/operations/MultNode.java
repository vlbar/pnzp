package com.vlsu.lab06.node.operations;

import com.vlsu.lab06.node.INode;

public class MultNode implements INode {
    private final INode leftNode;
    private final INode rightNode;

    public MultNode(INode leftNode, INode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int calculate() {
        if (leftNode.calculate() == 0)
            return 0;
        else
            return leftNode.calculate() * rightNode.calculate();
    }

    public String toString() {
        return "(" + leftNode.toString() + ") * (" + rightNode.toString() + ")";
    }

}
