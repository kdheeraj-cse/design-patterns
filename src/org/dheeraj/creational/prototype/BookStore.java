package org.dheeraj.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{

    private String name;
    private List<Book> bookList = new ArrayList<>();

    public BookStore(){

    }

    public BookStore(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBookDetailsFromDB(){
        for (int i = 0; i < 10; i++){
            Book book = new Book(i+1,"Book"+(i+1),(i%2 == 0)? "spiritual":"fictional");
            bookList.add(book);
        }
    }


    //default is shallow copy
    @Override
    protected BookStore clone() throws CloneNotSupportedException {
        BookStore store = new BookStore();
        for(Book b : this.getBookList()){
            store.getBookList().add(new Book(b.getId(), b.getName(), b.getGenre()));
        }
        return store;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
