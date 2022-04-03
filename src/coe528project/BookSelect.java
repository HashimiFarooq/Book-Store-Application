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
}
