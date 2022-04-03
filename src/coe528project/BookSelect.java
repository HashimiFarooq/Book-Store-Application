package coe528project;

import javafx.scene.control.CheckBox;

public class BookSelect {
    
    private String name;
    private double price;
    private CheckBox checkBox;
    private int id;

    public BookSelect(Book book, int id) {
        this.name = book.getName();
        this.price = book.getPrice();
        this.checkBox = new CheckBox();
        this.id = id;
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
    
    public boolean isSelected(){
        return checkBox.isSelected();
    }
    
    public int getId(){
        return this.id;
    }
}
