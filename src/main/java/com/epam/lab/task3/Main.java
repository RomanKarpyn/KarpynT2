package com.epam.lab.task3;

import com.epam.lab.task2.MyAnnotation;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Object object = new Show();
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
            System.out.println("Field value: " + myAnnotation.name());
        }
        MyAnnotation myAnnotation = clazz.getAnnotation(MyAnnotation.class);
        System.out.println("Class value: " + myAnnotation.name());
    }
}
