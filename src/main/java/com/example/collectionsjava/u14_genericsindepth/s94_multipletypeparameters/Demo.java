package com.example.collectionsjava.u14_genericsindepth.s94_multipletypeparameters;

public class Demo {
    public static void main(String[] args) {
        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("The Dry Trash");
        bin.setWetTrash(12345);
        System.out.println("Dry Trash: " + bin.getDryTrash());
        System.out.println("Wet Trash: " + bin.getWetTrash());
    }
}
