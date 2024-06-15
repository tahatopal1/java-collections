package com.example.collectionsjava.u10_maps.s43_identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        // Using HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "First");
        map.put(10, "Second"); // Replaces the previous entry
        System.out.println("HashMap: " + map);

        // Using IdentityHashMap
        Map<Integer, String> identityHashMap = new IdentityHashMap<>();
        Integer key1 = new Integer(10);
        Integer key2 = new Integer(10);
        identityHashMap.put(key1, "First");
        identityHashMap.put(key2, "Second"); // Both entries are stored
        System.out.println("IdentityHashMap: " + identityHashMap);

    }
}
