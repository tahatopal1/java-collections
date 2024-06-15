package com.example.collectionsjava.u06_genericsoverview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Demo {

    // Three main objectives of generics

    // 1) To provide type safety
    // 2) To solve the problem related to type-casting in collection
    // 3) To enable developer to write less redundant code

    public static void main(String[] args) {

        String[] strArray = new String[20];
        Employee[] empArray = new Employee[20];
        strArray[0] = "John";

        // The example below causes compile time error as arrays are type-safe in nature
        // strArray[0] = new Employee("John");

        // However, we mostly need to prefer collections to arrays
        // Without type, we can add any kind of object into ArrayList
        ArrayList list = new ArrayList();
        list.add("John");
        list.add(new Employee("John"));

        // After retrieval of items, we have to cast them
        // This is an extra effort, generics save the developers from this
        String name = (String) list.get(0);
        Employee emp = (Employee) list.get(1);

        // Also, inaccurate castings can cause errors on runtime like below
        try {
            Employee emp2 = (Employee) list.get(0);
        } catch (ClassCastException e) {
            System.out.println("Exception: " + e.getClass());
        }




    }

}

@Getter
@Setter
@AllArgsConstructor
class Employee {
    String name;
}
