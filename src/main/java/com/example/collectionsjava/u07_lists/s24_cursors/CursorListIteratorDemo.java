package com.example.collectionsjava.u07_lists.s24_cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("John");
        list.add("Jane");
        list.add("Bob");
        list.add("Mary");
        list.add("Jack");
        System.out.println(list);

        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            String item = li.next();
            if (item.equals("Jane")) {
                li.add("Tom");
            }
            if (item.equals("Jack")) {
                li.remove();
            }
            if (item.equals("Bob")) {
                li.set("Rob");
            }
        }
        System.out.println(list);
    }
}
