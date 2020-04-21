package com.vlsu.lab06;

import com.vlsu.lab06.node.INode;
import com.vlsu.lab06.node.SimpleNode;
import com.vlsu.lab06.node.operations.MultNode;
import com.vlsu.lab06.node.operations.SubstractNode;

public class Main {
    public static void main(String[] args) {
        INode firstTestNode = new MultNode(
                new SubstractNode(new SimpleNode(5), new SimpleNode(5)),
                new SubstractNode(new SimpleNode(3), new SimpleNode(1))
        );

        INode secondTestNode = new MultNode(
                new SubstractNode(new SimpleNode(5), new SimpleNode(3)),
                new SubstractNode(new SimpleNode(3), new SimpleNode(1))
        );

        System.out.println("The first expression is: " + firstTestNode.toString() + "\tValue is: " + firstTestNode.calculate());
        System.out.println("The second expression is: " + secondTestNode.toString() + "\tValue is: " + secondTestNode.calculate());
    }
}