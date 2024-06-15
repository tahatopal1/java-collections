package com.example.collectionsjava.u14_genericsindepth.s100_wildcardrestrictions;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void displayData(List<? super Integer> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        list.add(25);
    }

    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<>();
        List<? super Integer> list2 = new ArrayList<>();

        Integer n = 12;

        // list1 can hold any type that extends 'Number' so as there's an ambiguity, we cannot add
        // ... an item into that. (upper bounded wildcard)
        // list1.add(n); // Invalid

        // list2 is a lower bounded wildcard, so you have to pass a type which is a parent class of
        // ... Integer class. Therefore, any type that suits can accept object from Integer or its
        // subtypes.
        list2.add(n); // Valid
    }
}
