package org.dheeraj.creational.singleton;

public class SingletonDPLazy {

    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println("running "+Thread.currentThread().getName());
            DBConnectionSingletonLazy instance = DBConnectionSingletonLazy.getInstance();
        };

        for (int i = 0; i < 10; i++) {
           new Thread(runnable).start();
        }

    }

}



class DBConnectionSingletonLazy{

    private static volatile DBConnectionSingletonLazy instance = null;
    private final static String lock = "";
    private DBConnectionSingletonLazy(){
        System.out.println("creating lazy instance");
    }

    public static DBConnectionSingletonLazy getInstance(){
        if(instance != null){
            return instance;
        }
        synchronized(lock){
            if(instance == null){
                instance = new DBConnectionSingletonLazy();
            }
            return instance;
        }
    }

}


