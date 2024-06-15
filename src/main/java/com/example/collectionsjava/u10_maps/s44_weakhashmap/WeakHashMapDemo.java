package com.example.collectionsjava.u10_maps.s44_weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("***** HASH_MAP *****");
        Map hashMap = new HashMap();
        Temp hashMapTempElement = new Temp();
        hashMap.put(hashMapTempElement, "element");
        System.out.println(hashMap);
        hashMapTempElement = null;
        System.gc();
        Thread.sleep(3000);

        System.out.println(hashMap);

        System.out.println("***** WEAK_HASH_MAP *****");
        Map weakHashMap = new WeakHashMap<>();
        Temp weakHashMapTempElement = new Temp();
        weakHashMap.put(weakHashMapTempElement, "element");
        System.out.println(weakHashMap);

        weakHashMapTempElement = null;
        System.gc();
        Thread.sleep(3000);

        System.out.println(weakHashMap);

    }


}

class Temp {

    @Override
    public String toString() {
        return "Temp";
    }

    public void finalize() throws Throwable {
        System.out.println("Finalize method called.");
    }
}


