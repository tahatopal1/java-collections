package com.example.collectionsjava.u11_concurrentcollections.s57_copyonwritearrayset;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("John");
        list.add("Jane");
        list.add("Jane");
        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(list);
        System.out.println(set1);
    }
}
