package com.example.collectionsjava.u14_genericsindepth.s99_wildcardlowerbounded;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void displayData(List<? super Integer> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(57);
        displayData(list);

        List<Number> list1 = new ArrayList<>();
        list1.add(98);
        list1.add(67);
        displayData(list1);

        List<Double> list3 = new ArrayList<>();
        list3.add(12.1);
        list3.add(4.6);
        //displayData(list3); Not valid as Double is not superclass of Integer
    }
}
