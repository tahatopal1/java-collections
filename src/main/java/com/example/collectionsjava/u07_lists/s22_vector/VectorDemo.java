package com.example.collectionsjava.u07_lists.s22_vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v2 = new Vector(60);
        Vector v3 = new Vector(100, 5);
        // Vector v4 = new Vector(Collection c);

        v.add(10); // From Collection interface
        v.addElement("Hello"); // From Vector itself
        v.add(true);

        v.remove(0);
        System.out.println(v);
        System.out.println(v.elementAt(0));

        System.out.println("***** GET *****");
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(0));

        System.out.println("***** CAPACITY *****");
        Vector v4 = new Vector(5);
        for (int i = 0; i < 5; i++) {
            v4.addElement(i);
        }

        System.out.println("Before exceeding:");
        System.out.println("Size: " + v4.size());
        System.out.println("Capacity: " + v4.capacity());

        v4.add(10);

        System.out.println("After exceeding:");
        System.out.println("Size: " + v4.size());
        System.out.println("Capacity: " + v4.capacity());

    }
}
