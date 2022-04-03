package coe528project;

import javafx.scene.control.CheckBox;

public class BookSelect {
    
    private String name;
    private double price;
    private CheckBox checkBox;

    public BookSelect(Book book) {
        this.name = book.getName();
        this.price = book.getPrice();
        this.checkBox = new CheckBox();
    }

    BookSelect(int i, String naesdasda, CheckBox ch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
