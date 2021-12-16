package org.dheeraj.creational.singleton;

public class SingletonDPEarly {

    public static void main(String[] args){
        Runnable runnable = ()->{
          DBConnectionSingleton instance = DBConnectionSingleton.getInstance();
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

    }
}


class DBConnectionSingleton {

    private final static DBConnectionSingleton instance = new DBConnectionSingleton();

    private DBConnectionSingleton(){
        System.out.println("creating singleTonInstance");
    }

    public static DBConnectionSingleton getInstance(){
        return instance;
    }
}
