package com.example.collectionsjava.u10_maps.s47_treemap;

import java.util.Comparator;

public class CustomSorting implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
