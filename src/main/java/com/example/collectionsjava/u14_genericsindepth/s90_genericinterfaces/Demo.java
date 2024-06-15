package com.example.collectionsjava.u14_genericsindepth.s90_genericinterfaces;

public class Demo {
    public static void main(String[] args) {

        // Now we can use interface as a reference as Data inherits from IData
        IData<String> data = new Data<>("We have implemented a generic interface");
        System.out.println(data.getData());
    }
}
