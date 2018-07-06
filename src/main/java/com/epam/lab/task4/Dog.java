package com.epam.lab.task4;


public class Dog {


    private String name;
    private int age;
    public Dog() {
        // empty constructor
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDog(String name, int age) {
        System.out.println(name + " is " + age + " year(s) old.");
    }

    public void myMethod(String str, int... args) {
        System.out.println("int values that method takes,and String value:");
        for (int number : args) {
            System.out.println(String.format("%s-%d", str, number));
        }
    }
    public void myMethod(String... args) {
        System.out.println ("strings that method takes:");
        for (String str : args) {
            System.out.println(String.format("%s", str));
        }
    }
}

