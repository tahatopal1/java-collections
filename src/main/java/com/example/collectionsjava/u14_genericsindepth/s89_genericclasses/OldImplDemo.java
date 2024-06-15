package com.example.collectionsjava.u14_genericsindepth.s89_genericclasses;

public class OldImplDemo {
    public static void main(String[] args) {

        OldImpl d1 = new OldImpl("This is d1");
        System.out.println(d1.toString());

        OldImpl d2 = new OldImpl(10); // We can also create with Integer, but...

        int data = (int) (d1.getData()); // Once we infer a wrong type, it throws an error (ClassCastException).

    }
}
