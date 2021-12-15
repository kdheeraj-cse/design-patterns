package org.dheeraj.adapter;


//Structural design pattern
//
public class AdapterDemo {
    public static void main(String[] args) {

        IPhone12 iPhone12 = new IPhone12();
        AndroidToIphoneAdapter adapter = new AndroidToIphoneAdapter();
        iPhone12.setCharger(adapter);
        iPhone12.chargePhone();

    }
}
