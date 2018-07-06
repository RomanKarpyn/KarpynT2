package com.epam.lab.task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        Person person = new Person();
        main.print(person, person.getClass());
    }

    void print(Object o, Class c) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(MyAnnotation.class)) {
                    System.out.println(field.get(o));
                }
            }
        }
    }

}
