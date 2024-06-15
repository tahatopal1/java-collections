package com.example.collectionsjava.u07_lists.s20_linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

    // Allow duplicate elements
    // Insertion order is preserved
    // Accepts heterogeneous objects
    // 'null' insertion is possible

    public static void main(String[] args) {
        LinkedList l = new LinkedList(); // No parameter
        // LinkedList l = new LinkedList(Collection c); // Parameterized constructor

        // Heterogeneous collection
        l.add("John");
        l.add(10);
        l.add(null); // Null value can be inserted
        System.out.println(l);

        l.set(1, 13); // Setting the value at index 1 as 13
        System.out.println(l);

        l.add(2, true); // Adding value at index 2
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        l.addFirst(1);
        System.out.println(l);
    }
}
