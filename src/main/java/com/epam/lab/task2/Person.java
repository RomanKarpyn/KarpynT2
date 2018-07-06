package com.epam.lab.task2;

public class Person {
    @MyAnnotation(name = "name")
    String name = "Max";
    int age = 20;
    String surname = "Konrat";
    @MyAnnotation(name = "timeWork")
    int timeWork = 8;
    double salary = 9999.99;
}
