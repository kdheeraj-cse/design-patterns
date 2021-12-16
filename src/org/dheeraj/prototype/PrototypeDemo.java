package org.dheeraj.prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookStore store1 = new BookStore("Indian");
        store1.loadBookDetailsFromDB();



        BookStore store2 = (BookStore) store1.clone();
        store2.setName("Western");

        store2.getBookList().get(2).setName ("Chacha Chaudhary");

        System.out.println(store1.toString());
        System.out.println(store2.toString());

    }
}
