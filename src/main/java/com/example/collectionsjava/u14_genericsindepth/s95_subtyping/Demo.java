package com.example.collectionsjava.u14_genericsindepth.s95_subtyping;

import com.example.collectionsjava.u14_genericsindepth.s93_rawtype.Box;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i; // This is allowed since Integer extends the Object class

        // The following is also allowed since Integer and Double extend Number
        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(11));
        list.add(Double.valueOf(10.6));

        // The following is also allowed since SquareBox extend Box
        List<Box<Integer>> bList = new ArrayList<>();
        bList.add(new Box<>(List.of(1,2,3)));
        bList.add(new SquareBox<>(List.of(9,8,7)));

        // The following statement is not allowed, as ArrayList<Integer> is not a subtype of List<Number>
        // List<Number> l1 = new ArrayList<Integer>();

        // This is also not allowed
        // ArrayList<Number> l2 = new ArrayList<Integer>();

    }
}
