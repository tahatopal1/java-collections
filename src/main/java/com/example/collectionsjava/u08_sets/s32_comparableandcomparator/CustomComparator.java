package com.example.collectionsjava.u08_sets.s32_comparableandcomparator;

import java.util.Comparator;
import java.util.TreeSet;

// This time, it'll be sorted on descending order
public class CustomComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge() - o1.getAge();
    }

    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<Person>(new CustomComparator());
        persons.add(new Person("John Doe", 19));
        persons.add(new Person("Jane Doe", 18));
        persons.add(new Person("Garry White", 20));
        persons.forEach(System.out::println);
    }

}
