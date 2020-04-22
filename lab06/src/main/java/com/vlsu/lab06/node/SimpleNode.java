package com.vlsu.lab06.node;

public class SimpleNode implements INode {
    private final int value;

    public SimpleNode(int value) {
        this.value = value;
    }

    @Override
    public int calculate()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}
