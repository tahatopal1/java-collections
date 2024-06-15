package com.example.collectionsjava.u07_lists.s24_cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(36);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 3 == 0) {
                System.out.println(i);
            } else {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
