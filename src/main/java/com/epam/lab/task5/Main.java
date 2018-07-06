package com.epam.lab.task5;

import com.epam.lab.task4.Dog;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Class cl = Dog.class;
        Dog dog = new Dog();
        Field field = null;
        try {
            field = cl.getDeclaredField("age");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        if (field.getType() == String.class) {
            field.set(dog, "3");
        } else if ((field.getType() == Boolean.class) || (field.getType() == boolean.class)) {
            field.set(dog, true);
        } else if ((field.getType() == Double.class) || (field.getType() == double.class)) {
            field.set(dog, 3);
        } else if ((field.getType() == Float.class) || (field.getType() == float.class)) {
            field.set(dog, 3f);
        } else if ((field.getType() == Integer.class) || (field.getType() == int.class)) {
            field.set(dog, 3);
        } else if ((field.getType() == Character.class) || (field.getType() == char.class)) {
            field.set(dog, '3');
        }
        System.out.println("Now value set that dog is " + dog.getAge() + " year(s) old.");
    }
}
