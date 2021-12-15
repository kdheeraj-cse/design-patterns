package org.dheeraj.singleton;

import java.io.*;

public class SingletonSerializationProblem {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        {
            SerializedSingletonInstance instance = SerializedSingletonInstance.getInstance();
            instance.setValue("oracle");
            FileOutputStream out = new FileOutputStream(new File("text.txt"));
            ObjectOutputStream outStream = new ObjectOutputStream(out);
            outStream.writeObject(instance);
            outStream.flush();
            outStream.close();
            out.close();

            FileInputStream inputStream = new FileInputStream(new File("text.txt"));
            ObjectInputStream objIn = new ObjectInputStream(inputStream);
            SerializedSingletonInstance instance1 = (SerializedSingletonInstance) objIn.readObject();

            System.out.println(instance == instance1);
            instance1.setValue("mysql");
            System.out.println(instance.getValue());
            System.out.println(instance1.getValue());
        }
    }


}

class SerializedSingletonInstance implements Serializable{

    private static volatile SerializedSingletonInstance instance = null;
    private static Object lock = new Object();
    private String value;

    private SerializedSingletonInstance(){

    }

    public static SerializedSingletonInstance getInstance(){
        if(instance != null){
            return instance;
        }
        synchronized (lock){
            if(instance == null){
                instance = new SerializedSingletonInstance();
            }
            return instance;
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    protected Object readResolve(){
        return instance;
    }
}
