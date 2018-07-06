package com.epam.lab.task7;

import com.epam.lab.task4.Dog;

import java.lang.reflect.*;

public class Main {

    Class cl = Dog.class;

    public static void main(String[] args) {

        Main main = new Main();
        main.getInfOfFields();
        main.getInfOfConstructors();
        main.getInfOfMethods();

    }

    private void getInfOfFields() {
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Class fieldType = field.getType();
            System.out.print(String.format("field-%s,type of this field- ", field.getName()));
            System.out.println(fieldType.getName());
            int i = field.getModifiers();
            String modifier = Modifier.toString(i);
            System.out.println(String.format("field Modifier = %s", modifier));
            System.out.println("---------------");
        }
    }

    private void getInfOfConstructors() {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(String.format("Constructor name:%s", constructor.getName()));
            Parameter[] parameters = constructor.getParameters();
            System.out.println("Parameters of constructor:");
            if (parameters.length == 0) {
                System.out.println("constructor without parameters");
            } else {
                for (Parameter parameter : parameters) {
                    System.out.print(parameter.getName());
                    System.out.println(" parameter type-" + parameter.getType());
                }
            }
            System.out.println("-----------------");
        }
    }

    private void getInfOfMethods() {
        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(String.format("method name:%s,return type:", method.getName()));
            System.out.println(method.getReturnType());
            int i = method.getModifiers();
            String modifier = Modifier.toString(i);
            System.out.println(String.format("method Modifier = %s", modifier));
            System.out.println("method parameters:");
            Parameter[] parameters = method.getParameters();
            if (parameters.length == 0) {
                System.out.println("method without parameters");
            } else {
                for (Parameter parameter : parameters) {
                    System.out.println(String.format("param type:%s", parameter.getType()));
                }
            }
            System.out.println("--------------------");
        }
    }

}
