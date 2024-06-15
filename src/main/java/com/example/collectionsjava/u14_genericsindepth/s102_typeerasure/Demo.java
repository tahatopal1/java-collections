package com.example.collectionsjava.u14_genericsindepth.s102_typeerasure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(method1(10));
        ArrayList l1 = new ArrayList<String>();
        l1.add(123);
    }

    public static String method1(Integer i) {
        List<String> a = new LinkedList<>();
        List b = a;

        b.add(i); // This is possible
        return a.iterator().next();
    }

}
