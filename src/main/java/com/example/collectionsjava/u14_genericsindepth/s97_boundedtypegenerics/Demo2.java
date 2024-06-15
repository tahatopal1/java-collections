package com.example.collectionsjava.u14_genericsindepth.s97_boundedtypegenerics;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

    // Bounded Type With Method

    public static void main(String[] args) {
        List<Integer> iList = Arrays.asList(4, 5, 1, 7);
        List<Double> dList = Arrays.asList(4.4, 5.1, 1.9, 7.1);
        List<String> sList = Arrays.asList("Hello", "There");

        // These two are valid since Integer and Double extend the Number class
        getSortedData(iList);
        getSortedData(dList);

        // This one is invalid as String is not a subclass of the Number class
        // getSortedData(sList);

    }

    public static <T extends Number> void getSortedData(List<T> list) {
        System.out.println("Sorting...");
        list.sort(null);
        list.forEach(System.out::println);
    }

}
