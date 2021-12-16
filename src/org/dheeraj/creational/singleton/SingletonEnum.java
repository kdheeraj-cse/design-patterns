package org.dheeraj.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonEnum {


    public static void main(String[] args) throws NoSuchMethodException {

        SingletonEnum t = new SingletonEnum();

        SingletonClass singletonClass = SingletonClass.INSTANCE;
        singletonClass.setValue("100");




        Constructor constructor = t.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        SingletonClass singletonClass1 = SingletonClass.INSTANCE;
        System.out.println(singletonClass1.getValue());



    }
}


enum SingletonClass{
    INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("setting value");
        this.value = value;
    }
}
