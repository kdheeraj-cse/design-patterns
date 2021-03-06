package org.dheeraj.behavioral.observer;

public interface Publisher {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);
    void pushMessage(String message);

}
