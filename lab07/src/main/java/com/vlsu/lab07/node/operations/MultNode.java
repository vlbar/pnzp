package com.vlsu.lab07.node.operations;

import com.vlsu.lab07.node.INode;
import com.vlsu.lab07.node.SimpleNode;

import java.util.Collection;

public class MultNode implements INode {
    private final Collection<INode> nodeList;

    public MultNode(Collection<INode> nodeList) {
        this.nodeList = nodeList;
    }

    public int calculate() {
        int result = 1;
        for(INode node : nodeList)
        {
            result *= node.calculate();
            if(result == 0) break;
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;

        for(INode node : nodeList)
        {
            if(!first) result += "+";
            first = false;

            result += "(" + node + ")";
        }

        return result;
    }
}
