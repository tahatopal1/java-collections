package com.example.collectionsjava.u08_sets.s29_sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(10);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(3);
        sortedSet.add(7);
        System.out.println(sortedSet); // Will be printed as sorted in ascending order

        // Methods in SortedSet Interface

        System.out.println("***** FIRST *****");
        System.out.println(sortedSet.first());

        System.out.println("***** LAST *****");
        System.out.println(sortedSet.last());

        System.out.println("***** HEAD SET *****");
        System.out.println(sortedSet.headSet(3)); // Returns the set up until to 3 (3 is not included)

        System.out.println("***** TAIL SET *****");
        System.out.println(sortedSet.tailSet(3)); // Returns the set starting from 3 (3 is included)


    }
}
