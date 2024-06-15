package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s65_examplesoflambda;

public class Example4 {
    public static void main(String[] args) {
//        MyFunInterface3 i = new ImplMyFunInterface3();
        MyFunInterface3 i = a -> { // A multi-line example
            int x = a + 10;
            x = x / 2;
            return x;
        };
        int op = i.doSomeCalculation(100);
        System.out.println(op);
    }
}

interface MyFunInterface3 {
    int doSomeCalculation(int a);
}

//class ImplMyFunInterface3 implements MyFunInterface3 {
//    // A multi-line example
//    @Override
//    public int doSomeCalculation(int a) {
//        int x = a + 10;
//        x = x / 2;
//        return x;
//    }
//}
