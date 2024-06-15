package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s79_doublecolonconstructorreference;

public class Demo {
    public static void main(String[] args) {
        Details d = Student::new;
        Student john = d.getStudent("John");
    }
}

class Student {
    Student(String name) {
        System.out.println(name + " is successfully enrolled!");
    }
}

interface Details {
    Student getStudent(String name);
}