package com.vlsu.lab07.node.operations;

import com.vlsu.lab07.node.INode;
import com.vlsu.lab07.node.SimpleNode;

import java.util.Collection;

public class SubstractNode implements INode {
    private final Collection<INode> nodeList;

    public SubstractNode(Collection<INode> nodeList) {
        this.nodeList = nodeList;
    }

    public int calculate() {
        int result = 0;
        boolean first = true;
        for (INode node : nodeList) {
            if (first) {
                result = node.calculate();
                first = false;
            } else {
                result -= node.calculate();
            }
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;
        for (INode node : nodeList) {
            if (!first) result += "-";
            first = false;

            result += "(" + node + ")";
        }
        return result;
    }
}
