package com.example.collectionsjava.u14_genericsindepth.s92_genericswithcollection;

import java.util.ArrayList;

public class DemoUnsuccessful {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("John");
        list.add(1);

        for (Object object : list) {
            // This example is error-prone to type casting as we don't have generics here
            String str = (String) object;
        }
    }
}
