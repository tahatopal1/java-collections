package com.example.collectionsjava.u07_lists.s18_arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    // There's a resizable or growable array underneath (with default size of 10)
    // Allows duplicate elements
    // Accepts heterogeneous objects

    public static void main(String[] args) {

        // ------ WITHOUT GENERICS ------
        System.out.println("------ WITHOUT GENERICS ------");

        // Without an initial size
        ArrayList arrayList = new ArrayList();

        // With an initial size
        // If we're sure about the size of the arraylist, we can pass
        // ... an initial size to prevent some unnecessary resizing of array
        ArrayList arrayListWithSize = new ArrayList(30);

        // Heterogeneous content
        arrayList.add("John");
        arrayList.add(true);
        arrayList.add(10);

        System.out.println(arrayList);

        // If we're meant to remove an integer element, we should do the following
        arrayList.remove(new Integer(10));

        // arrayList.remove(10); --> This one will try to remove the element on 10th index
        // ... instead of removing the Integer value 10

        System.out.println(arrayList);

        // Another usage
        // ArrayList arrayListWithCollection = new ArrayList(Collection c);

        // We need to do an additional casting on retrieval
        boolean b = (boolean) arrayList.get(1);
        System.out.println(b);

        // ------ WITH GENERICS ------
        System.out.println("------ WITH GENERICS ------");
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("John");
        String name = stringArrayList.get(0); // No need for type casting
        System.out.println(name);
    }
}
