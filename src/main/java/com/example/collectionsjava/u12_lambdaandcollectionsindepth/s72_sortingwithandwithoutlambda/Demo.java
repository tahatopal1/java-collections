package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s72_sortingwithandwithoutlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(11);
        System.out.println(list);

        // This one only sorts in ascending order
        System.out.println("***** ASCENDING ******");
        Collections.sort(list);
        System.out.println(list);

        // When we need to sort in a custom order (such as descending order) we'll need a Comparator
        System.out.println("***** DESCENDING ******");
        Collections.sort(list, new CustomComparator());

        // Some other functions to reverse or reverse order
        // Collections.reverse(list);
        // Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // We don't really need to have an implementation class as we have lambda here
        System.out.println("***** DESCENDING WITH LAMBDA ******");

        Collections.sort(list, (o1, o2) -> (o1 > o2 ? -1 : (o2 > o1 ? 1 : 0)));
        System.out.println(list);

    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else return 0;
    }
}
