package org.dheeraj.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PressTrustofIndia implements Publisher{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void pushMessage(String message) {
        for (Observer o:
             observers) {
            o.printPushedMessage(message);
        }
    }
}
