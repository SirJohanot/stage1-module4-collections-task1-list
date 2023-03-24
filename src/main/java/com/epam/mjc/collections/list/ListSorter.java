package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);

        int functionDiff = calculateFunction(aNum) - calculateFunction(bNum);
        return (functionDiff == 0) ? (aNum - bNum) : functionDiff;
    }

    private int calculateFunction(int number) {
        return 5 * (int) Math.pow(number, 2) + 3;
    }
}
