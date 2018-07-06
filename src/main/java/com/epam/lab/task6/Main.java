package com.epam.lab.task6;

import com.epam.lab.task4.Dog;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Class cl = Dog.class;
        Dog dog = new Dog();
        try {
            Method myMethod1 = cl.getMethod("myMethod", String[].class);
            System.out.println("invoke myMethod(String ... args)");

            myMethod1.invoke(dog, (Object) new String[]{"gav", "gav", "gav"});
            int[] array = {1, 2, 3};

            Method myMethod2 = cl.getMethod("myMethod", String.class, int[].class);
            System.out.println("invoke myMethod(String line,Integer...args)");

            myMethod2.invoke(dog, "Rom", array);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
