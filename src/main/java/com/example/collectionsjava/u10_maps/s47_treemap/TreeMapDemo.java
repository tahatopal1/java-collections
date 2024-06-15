package com.example.collectionsjava.u10_maps.s47_treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // Constructors
        Map m = new TreeMap();

        // Map m1 = new TreeMap(Comparator c);
        SortedMap s = new TreeMap();
        TreeMap m2 = new TreeMap(s);

        Map m4 = new HashMap();
        Map m3 = new TreeMap(m4);

        m.put(23, "");
        m.put(10, "");
        m.put(10, "Maths");
        m.put(11, "Science");
        System.out.println(m); // Will print in the ascending order of the keys

        Map m6 = new TreeMap(new CustomSorting());
        m6.put("John", 10);
        m6.put("Tom", 10);
        m6.put("Jane", 10);
        System.out.println(m6);

    }
}
