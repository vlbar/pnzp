package com.vlsu.lab05;

import com.vlsu.lab05.lists.ListElement;
import com.vlsu.lab05.lists.ListUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please, enter the number of elements: ");
        int n = console.nextInt();
        System.out.println("Now, enter the elements: ");

        //вводим элементы
        ListElement first = null;
        for (int i = 0; i < n; i++) {
            int value = console.nextInt();
            first = ListUtils.insert(first, value);
        }

        //не хочу портить читаемость и "красоту" кода, используя int sum = ListUtils.sum(ListUtils.raiseToCube(ListUtils.filterDivBy3(first)));
        ListElement filteredListElem = ListUtils.filterDivBy3(first);
        ListElement cubedListElem = ListUtils.raiseToCube(filteredListElem);
        int sum = ListUtils.sum(cubedListElem);
        System.out.println(sum);
    }
}
