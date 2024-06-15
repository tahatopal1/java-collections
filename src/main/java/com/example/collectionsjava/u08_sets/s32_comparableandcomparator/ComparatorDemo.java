package com.example.collectionsjava.u08_sets.s32_comparableandcomparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        // We can also achieve it by using functional expressions instead of creating custom Comparators
        TreeSet<Person> persons = new TreeSet<Person>(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
        persons.add(new Person("John Doe", 19));
        persons.add(new Person("Jane Doe", 18));
        persons.add(new Person("Garry White", 20));
        persons.forEach(System.out::println);
    }
}
