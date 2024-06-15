package com.example.collectionsjava.u14_genericsindepth.s101_behaviourgeneric;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        // An example
        ArrayList list = new ArrayList();
        list.add(12);
        list.add("Test");
        list.add(true);
        method(list);
        list.forEach(System.out::println);
        System.out.println("----------------");

        // Another example
        // We can do that, However...
        ArrayList<String> list2 = list;

        // If we try to do the following, we get ClassCastException in runtime
        //list2.forEach(System.out::println);

        // A solution (Actually, it's pretty much the same as the first example)
        ArrayList list3 = list;
        list3.forEach(System.out::println);
    }

    public static void method(ArrayList<String> list) {
        list.add("See this");
    }
}
