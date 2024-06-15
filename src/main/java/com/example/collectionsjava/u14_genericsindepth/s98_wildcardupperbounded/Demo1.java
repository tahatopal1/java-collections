package com.example.collectionsjava.u14_genericsindepth.s98_wildcardupperbounded;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(57);
        displayData(list);
    }

    public static void displayData(List<?> l) {
        for (Object o : l) {
            System.out.println(o);
        }
    }
}
