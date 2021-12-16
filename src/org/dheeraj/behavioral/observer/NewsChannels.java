package org.dheeraj.behavioral.observer;

public class NewsChannels implements Observer{

    Publisher publisher;
    String name;

    public NewsChannels(String name){
        this.name = name;
    }

    @Override
    public void subscribe(Publisher publisher) {
     this.publisher = publisher;
     this.publisher.subscribe(this);
    }

    @Override
    public void getUpdate() {

    }

    @Override
    public void unSubscribe() {
        this.publisher.unSubscribe(this);
    }

    @Override
    public void printPushedMessage(String message) {
        System.out.println(name +" showing news : "+message);
    }
}
