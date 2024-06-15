package com.example.collectionsjava.u14_genericsindepth.s92_genericswithcollection;

import java.util.ArrayList;
import java.util.List;

public class DemoSuccessful {

    // Benefits of generics
    // Stronger type checks
    // Elimination of casts
    // Code reusability

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John");
        // list.add(1);     This is not allowed.
        for (String s : list) {
            System.out.println(s); // With no error!
        }
    }
}
