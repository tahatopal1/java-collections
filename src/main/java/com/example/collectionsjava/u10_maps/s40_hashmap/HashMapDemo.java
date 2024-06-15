package com.example.collectionsjava.u10_maps.s40_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Some of the constructors
        HashMap<Integer, String> map = new HashMap<>();
        Map m = new HashMap();
        HashMap map1 = new HashMap(20);
        HashMap map2 = new HashMap(20, 0.9f);
        HashMap map3 = new HashMap(m);

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 90);

        marks.put("FB", 10);
        marks.put("Ea", 10); // These two will produce the same hash code, therefore will be inserted into same bucket
        marks.put("Science", 10); // This will update the Science mark

        System.out.println("**** GET ****");
        System.out.println("Science mark: " + marks.get("Science"));

        System.out.println("**** KEY SET ****");
        System.out.println("Keys: " + marks.keySet());

        System.out.println("**** ENTRY SET ****");
        System.out.println("Entries: " + marks.entrySet());

        System.out.println("**** VALUES ****");
        System.out.println("Values: " + marks.values());

        System.out.println("**** CLONE ****"); // This is shallow copy
        System.out.println("Clone: " + marks.clone());

        System.out.println("**** CONTAINS KEY ****");
        System.out.println("Contains 'Maths': " + marks.containsKey("Maths"));
        System.out.println("Contains 'Physics': " + marks.containsKey("Physics"));

        System.out.println("**** REMOVE ****");
        System.out.println("Remove Maths: " + marks.remove("Maths"));
        System.out.println("Contains 'Maths': " + marks.containsKey("Maths"));

        System.out.println("Remove English: " + marks.remove("English", 80)); // Remove if English is 80
        System.out.println("Contains 'English': " + marks.containsKey("English"));

        System.out.println(marks);

        System.out.println("**** COMPUTE IF ABSENT ****");
        marks.computeIfAbsent("Biology", k -> k.length() * 10);
        System.out.println("Biology mark: " + marks.get("Biology"));

    }
}
