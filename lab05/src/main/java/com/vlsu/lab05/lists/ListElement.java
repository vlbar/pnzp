package com.vlsu.lab05.lists;

public class ListElement {
    private final int value;
    private ListElement nextElem;

    //конструктор
    public ListElement(int value) {
        this.value = value;
    }

    //получить значение элемента
    public int getValue() {
        return value;
    }

    //получить следующий элемент
    public ListElement getNext() {
        return nextElem;
    }

    //присвоить значение элементу
    public void setNext(ListElement nextElem) {
        this.nextElem = nextElem;
    }
}
