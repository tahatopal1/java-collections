package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s65_examplesoflambda;

public class Example3 {
    public static void main(String[] args) {
//        MyFunInterface2 i = new ImplMyFunInterface2();
        MyFunInterface2 i = s -> s.length();
        int len = i.findLength("Lambda");
        System.out.println("Length of the given string is: " + len);
    }
}

interface MyFunInterface2 {
    int findLength(String str); // Has a return type and an argument
}

//class ImplMyFunInterface2 implements MyFunInterface2 {
//    @Override
//    public int findLength(String str) {
//        return str.length();
//    }
//}