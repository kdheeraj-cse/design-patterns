package org.dheeraj.observer;

public interface Observer {

    void subscribe(Publisher publisher);
    void getUpdate();
    void unSubscribe();
    void printPushedMessage(String message);


}
