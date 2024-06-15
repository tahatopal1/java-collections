package com.example.collectionsjava.u11_concurrentcollections.s55_concurrenthashmapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

    // This example won't throw a ConcurrentModificationException just like we have in the example with HashMap

    static Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();

    public static void main(String[] args) {
        ConcurrentHashMapDemo tChild = new ConcurrentHashMapDemo();
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Jack");
        map.put(4, "Jill");
        tChild.start();
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(map);
        }
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(5, "Garry");
    }

}
