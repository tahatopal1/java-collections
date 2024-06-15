package com.example.collectionsjava.u08_sets.s32_comparableandcomparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.TreeSet;

public class ComparableDemo {

    //  Comparable: Used for natural sorting order within the class itself.
    //  Comparator: Used for custom sorting order, can be used outside the class.

    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<Person>();
        persons.add(new Person("John Doe", 19));
        persons.add(new Person("Jane Doe", 18));
        persons.add(new Person("Garry White", 20));
        persons.forEach(System.out::println);
    }
}

@AllArgsConstructor
@ToString
@Getter
class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
