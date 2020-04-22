package com.vlsu.lab05.lists;

public class ListUtils {
    //вставка элемента в начало списка
    public static ListElement insert(ListElement first, int value) {
        if (first == null) {
            return new ListElement(value);
        } else {
            ListElement newElement = new ListElement(value);
            newElement.setNext(first);
            return newElement;
        }
    }

    //филтрование списка, значениями делящимися только на 3
    public static ListElement filterDivBy3(ListElement first) {
        ListElement resultListElement = null;
        while (first != null) {
            int value = first.getValue();
            if (value % 3 == 0) {
                resultListElement = insert(resultListElement, value);
            }
            first = first.getNext();
        }
        return resultListElement;
    }

    //рекурсивное возведение элементов списка в куб
    public static ListElement raiseToCube(ListElement first) {
        if (first == null) {
            return null;
        }

        int value = first.getValue();
        return insert(raiseToCube(first.getNext()), value * value * value);
    }

    //сумма элементов списка
    public static int sum(ListElement first) {
        int sum = 0;
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }
}
