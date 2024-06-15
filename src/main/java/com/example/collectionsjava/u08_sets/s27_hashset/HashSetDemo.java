package com.example.collectionsjava.u08_sets.s27_hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // 4 different ways of creating a HashSet

        HashSet hs = new HashSet(); // Initial capacity is 16 by default with load factor 0.75
        HashSet hs2 = new HashSet(100);
        HashSet hs3 = new HashSet(100, .8f);
        HashSet hs4 = new HashSet(new ArrayList());
    }
}
