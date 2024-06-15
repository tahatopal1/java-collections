package com.example.collectionsjava.u14_genericsindepth.s97_boundedtypegenerics;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

    // Bounded Type With Class

    public static void main(String[] args) {
        List<Integer> iList = Arrays.asList(4, 5, 1, 7);
        List<Double> dList = Arrays.asList(4.4, 5.1, 1.9, 7.1);
        List<String> sList = Arrays.asList("Hello", "There");

        // These two are valid since Integer and Double extend the Number class
        DataSorter<Integer> sorter1 = new DataSorter<>(iList);
        DataSorter<Double> sorter2 = new DataSorter<>(dList);

        // This one is invalid as String is not a subclass of the Number class
        // DataSorter<String> sorter3 = new DataSorter<>(sList);

        sorter1.getSortedData();
        sorter2.getSortedData();
    }
}

// Let's assume we only want to sort the numeric date
class DataSorter<T extends Number> {
    private List<T> list;

    public DataSorter(List<T> list) {
        this.list = list;
    }

    public void getSortedData() {
        System.out.println("Sorting...");
        list.sort(null); // Natural sorting order
        list.forEach(System.out::println);
    }

}
