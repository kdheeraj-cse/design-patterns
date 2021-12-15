package org.dheeraj.builder;

public class BuilderDemo {

    public static void main(String[] args) {
//        Phone phone = new Phone();

        PhoneBuilder phoneBuilder = new PhoneBuilder();

        Phone phone = phoneBuilder.setOs("Android").setBattery("3500mah").setRam("4GB").build();

        System.out.println(phone);


    }
}
