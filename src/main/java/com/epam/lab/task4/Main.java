package com.epam.lab.task4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        String dogClassName = "com.epam.lab.task4.Dog";
        Class<?> dogClass = Class.forName(dogClassName);
        Object dog = dogClass.newInstance();

        String methodName = "";

        methodName = "setName";
        Method setNameMethod = dog.getClass().getMethod(methodName, String.class);
        setNameMethod.invoke(dog, "Simpson");

        methodName = "getName";
        Method getNameMethod = dog.getClass().getMethod(methodName);
        String name = (String) getNameMethod.invoke(dog);

        methodName = "printDog";
        Class<?>[] paramTypes = {String.class, int.class};
        Method printDogMethod = dog.getClass().getMethod(methodName, paramTypes);
        printDogMethod.invoke(dog, name, 1);
    }
}
