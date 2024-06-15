package com.example.collectionsjava.u13_streamsindepth.s87_parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        long time1, time2;

        List<Employee> eList = new ArrayList<>();
        for (int i = 0; i < 9999999; i++) {
            eList.add(new Employee("John", 20000));
            eList.add(new Employee("Tom", 3000));
            eList.add(new Employee("Jane", 15000));
            eList.add(new Employee("Tim", 8000));
            eList.add(new Employee("Diana", 1000));
            eList.add(new Employee("Jenny", 12000));
            eList.add(new Employee("Peter", 9000));
        }

        // Sequential Processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = " + eList.stream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();

        System.out.println("Sequential Stream Time Taken: " + (time2 - time1));

        // Parallel Processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = " + eList.parallelStream().filter(e -> e.getSalary() > 1000).count());
        time2 = System.currentTimeMillis();

        System.out.println("Parallel Stream Time Taken: " + (time2 - time1));

    }
}
