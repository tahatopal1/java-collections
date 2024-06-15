package com.example.collectionsjava.u07_lists.s24_cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorEnumDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Enter the elements: ");

        for (int i = 0; i < 8; i++) {
            Scanner scanner = new Scanner(System.in);
            Integer value = scanner.nextInt();
            v.addElement(value);
        }

        System.out.println("Vector: " + v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            Integer value = (Integer) e.nextElement();
            if (value % 3 == 0) {
                System.out.println(value);
            }
        }
    }
}
