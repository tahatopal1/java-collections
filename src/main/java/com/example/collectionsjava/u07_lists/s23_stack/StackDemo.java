package com.example.collectionsjava.u07_lists.s23_stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(true);

        System.out.println("***** INITIAL *****");
        System.out.println(s);

        System.out.println("***** POP *****");
        Object o = s.pop(); // Removes and returns the last inserted item
        System.out.println(o);
        System.out.println(s);

        System.out.println("***** PEAK *****");
        Object peeked = s.peek(); // Returns bot does not remove the last inserted item
        System.out.println(peeked);
        System.out.println(s);

        System.out.println("***** EMPTY *****");
        System.out.println(s.isEmpty()); // Controls if the stack is empty, if so returns true, otherwise returns false

        System.out.println("***** SEARCH *****");
        System.out.println(s.search(10)); // Returns the offset

    }
}
