package com.example.collectionsjava.u11_concurrentcollections.s51_concurrencymodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrencyModificationExceptionDemo extends Thread{
    private static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        ConcurrencyModificationExceptionDemo tchild = new ConcurrencyModificationExceptionDemo();
        list.add("John");
        list.add("Tom");
        list.add("Jim");
        list.add("Tim");
        Iterator<String> iterator = list.iterator();
        tchild.start();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Main Thread iterating: " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add("Tom");
    }
}
