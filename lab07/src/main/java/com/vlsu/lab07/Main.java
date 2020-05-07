package com.vlsu.lab07;

import com.vlsu.lab07.node.INode;
import com.vlsu.lab07.node.SimpleNode;
import com.vlsu.lab07.node.operations.MultNode;
import com.vlsu.lab07.node.operations.SubstractNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //выглядит неоч((9
        INode firstTestNode = new MultNode(Arrays.<INode>asList(
                new SubstractNode(Arrays.<INode>asList(new SimpleNode(5), new SimpleNode(5))),
                new SubstractNode(Arrays.<INode>asList(new SimpleNode(3), new SimpleNode(1))),
                new SimpleNode(2),
                new SimpleNode(3)
        ));

        INode secondTestNode = new MultNode(Arrays.<INode>asList(
                new SubstractNode(Arrays.<INode>asList(new SimpleNode(5), new SimpleNode(3))),
                new SubstractNode(Arrays.<INode>asList(new SimpleNode(3), new SimpleNode(1))),
                new SimpleNode(2),
                new SimpleNode(3)
        ));

        System.out.println("The first expression is: " + firstTestNode.toString() + "\tValue is: " + firstTestNode.calculate());
        System.out.println("The second expression is: " + secondTestNode.toString() + "\tValue is: " + secondTestNode.calculate());
    }
}
