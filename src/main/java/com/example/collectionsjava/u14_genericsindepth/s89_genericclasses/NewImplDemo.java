package com.example.collectionsjava.u14_genericsindepth.s89_genericclasses;

public class NewImplDemo {

    // The following example won't throw an exception as we've used Generics.

    public static void main(String[] args) {
        NewImpl<String> d1 = new NewImpl<>("This is d1");
        System.out.println(d1.toString());

        // If you try to do the following, it'll give a compile time error and prevent you from having it in runtime
        // NewImpl<Integer> d2 = new NewImpl<>("This is d2");

        NewImpl<Integer> d2 = new NewImpl<>(10);
        System.out.println(d2.toString());
    }
}
