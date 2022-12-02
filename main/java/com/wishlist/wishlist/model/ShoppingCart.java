package com.wishlist.wishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import com.wishlist.wishlist.model.Book;

@Entity

public class ShoppingCart {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer ISBN;

    private String user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    private ArrayList<Integer> booksList = new ArrayList<>();

    public void addBook (Integer ISBN) {booksList.add(ISBN);}

    public void removeBook (Integer ISBN) {booksList.remove(ISBN);}

    public void removeAllBooks() {booksList = null;}

    public ArrayList<Integer> getBook() {return booksList;}

}
