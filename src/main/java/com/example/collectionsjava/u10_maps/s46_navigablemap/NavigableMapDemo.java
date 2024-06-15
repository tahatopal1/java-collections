package com.example.collectionsjava.u10_maps.s46_navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("ABC", 123);
        map.put("DEF", 456);
        map.put("HIJ", 789);
        map.put("PQR", 546);
        map.put("XYZ", 776);
        map.put("JKL", 987);
        map.put("STU", 544);
        map.put("LMN", 543);

        System.out.println("**** NAVIGABLE MAP ****");
        System.out.println(map);

        // Returns a key-value mapping associated with the least key greater than or equal to the given key, or null
        // ... 'null' if there's no such key.
        System.out.println("**** CEILING ENTRY ****");
        System.out.println(map.ceilingEntry("HIJ"));

        // Returns the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println("**** FLOOR KEY ****");
        System.out.println(map.floorKey("PQR"));

        // Returns the least key strictly greater than the given key, or null if there is no such key.
        System.out.println("**** HIGHER KEY ****");
        System.out.println(map.higherKey("ABC"));

        // Returns the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println("**** LOWER KEY ****");
        System.out.println(map.lowerKey("PQR"));

        // Returns the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println("**** CEILING KEY ****");
        System.out.println(map.ceilingKey("XYZ"));

        // Returns a NavigableSet view of the keys contained in this map, in descending order.
        System.out.println("**** DESCENDING KEY SET ****");
        System.out.println(map.descendingKeySet());

        // Returns a reverse order view of the mappings contained in this map.
        System.out.println("**** DESCENDING MAP ****");
        System.out.println(map.descendingMap());

        // Returns a view of the portion of this map whose keys are less than (or equal to, if inclusive is true) toKey.
        System.out.println("**** HEAD MAP ****");
        System.out.println(map.headMap("JKL"));
        System.out.println(map.headMap("JKL", true));

        // Returns a view of the portion of this map whose keys range from fromKey to toKey.
        System.out.println("**** SUB MAP ****");
        System.out.println(map.subMap("PQR", "XYZ"));
        System.out.println(map.subMap("ABC", true, "PQR", false));

        // Returns a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true)
        // ... fromKey.
        System.out.println("**** TAIL MAP ****");
        System.out.println(map.tailMap("JKL"));
        System.out.println(map.tailMap("PQR", false));

        // Returns a key-value mapping associated with the least key strictly greater than the given key, or null if
        // ... there is no such key.
        System.out.println("**** HIGHER ENTRY ****");
        System.out.println(map.higherEntry("STU"));

        // Returns a NavigableSet view of the keys contained in this map.
        System.out.println("**** NAVIGABLE KEY SET ****");
        System.out.println(map.navigableKeySet());

    }
}
