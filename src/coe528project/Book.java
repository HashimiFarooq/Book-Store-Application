package coe528project;

import java.util.ArrayList;

public class Book {
    public static ArrayList<Book> books = new ArrayList<Book>();
    
    private String name;
    private double price;
    
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
