package com.example.collectionsjava.u08_sets.s30_navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> data = new TreeSet<>();
        data.add(1000);
        data.add(3000);
        data.add(13000);
        data.add(40000);
        data.add(54000);
        System.out.println("---- Tree Set ----");
        System.out.println(data);
        System.out.println("------------------------------------------------");

        // Methods

        // Returns the greatest element in the set which is less than or equal to given element
        // ... or NULL if there is no such element.
        System.out.println("***** FLOOR *****");
        System.out.println(data.floor(13550));

        // Returns the greatest element in the set which is less than the given element or NULL
        // ... if there is no such element.
        System.out.println("***** LOWER *****");
        System.out.println(data.lower(14000));

        // Returns the least element in the set which is greater than or equal to given element
        // ... or NULL if there is no such element.
        System.out.println("***** CEILING *****");
        System.out.println(data.ceiling(14000));

        // Returns the least element in this set which is greater than the given element or NULL
        // ... if there is no such element.
        System.out.println("***** HIGHER *****");
        System.out.println(data.lower(4000));

        // Retrieves and removes the first least element or returns NULL if there is no element
        System.out.println("***** POLL FIRST *****");
        System.out.println(data.pollFirst());

        // Retrieve and remove the first least element or returns NULL if there is no element
        System.out.println("***** POLL LAST *****");
        System.out.println(data.pollLast());

        // Returns navigable set in reverse order
        System.out.println(data.descendingSet());

    }
}
