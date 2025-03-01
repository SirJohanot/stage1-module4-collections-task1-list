package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        sourceList.forEach(number -> {
            if (number % 2 == 1) {
                result.add(0, number);
            } else {
                result.add(number);
            }
        });
        return result;
    }
}
