package com.example.collectionsjava.u11_concurrentcollections.s56_copyonwritearraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// This example won't throw an error. However, if you replace CopyOnWriteArrayList with ArrayList, it'll throw
// ... ConcurrentModificationException

public class CopyOnWriteArrayListDemo extends Thread{
    static List<String> list = new CopyOnWriteArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayListDemo tChild = new CopyOnWriteArrayListDemo();
        list.add("John");
        list.add("Jane");
        list.add("Bob");
        list.add("Mary");
        Iterator<String> iterator = list.iterator();
        tChild.run();
        while (iterator.hasNext()) {
            Thread.sleep(100);
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
        System.out.println("Eventual Result: " + list);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add("Ken");
    }
}
