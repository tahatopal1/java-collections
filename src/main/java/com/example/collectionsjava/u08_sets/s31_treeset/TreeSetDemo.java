package com.example.collectionsjava.u08_sets.s31_treeset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Here's some constructors
        TreeSet ts = new TreeSet();

        SortedSet ss = new TreeSet();
        TreeSet ts2 = new TreeSet(ss);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);

        // If you try to add an item into the TreeSet that doesn't implement Comparable, it throws error
        try {
            TreeSet<Employee> employees = new TreeSet();
            employees.add(new Employee("John", "Smith", 9000.0));
        } catch (Exception e) { // ClassCastException
            System.out.println(e.getClass().toGenericString());
        }


        // This one doesn't throw error as we used a comparator
        TreeSet<Employee> employees2 = new TreeSet<>(Comparator.comparing(Employee::getSalary));
        employees2.add(new Employee("John", "Smith", 9000.0));
        employees2.add(new Employee("Jane", "Black", 4000.0));
        employees2.add(new Employee("Garry", "White", 3000.0));
        employees2.add(new Employee("George", "Brown", 20000.0));

        // We'll see the items as sorted (ascending order) based on salary
        employees2.forEach(System.out::println);

    }

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {
    private String name;
    private String surname;
    private double salary;
}
