package com.example.collectionsjava.u09_queues.s35_priorityqueues;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Default constructor with initial capacity of 11
        PriorityQueue pq = new PriorityQueue<>();

        // Constructor with initial capacity
        PriorityQueue pq2 = new PriorityQueue(20);

        // Constructor with initial capacity and Comparator
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(20, (a, b) -> b - a);
        pq3.add(1);
        pq3.add(3);
        pq3.add(32);
        pq3.add(8);

        while (!pq3.isEmpty()) {
            System.out.println(pq3.poll());
        }

        System.out.println("--------------------------");
        // With natural priority (based on compareTo)
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(20);
        pq4.add(1);
        pq4.add(3);
        pq4.add(32);
        pq4.add(8);

        while (!pq4.isEmpty()) {
            System.out.println(pq4.poll());
        }

        // Constructor with collection
        PriorityQueue pq5 = new PriorityQueue(new ArrayList());
    }

}
