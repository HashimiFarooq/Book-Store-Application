package coe528project;

import java.util.ArrayList;

public class Customer extends User{
    
    private int points;
    
    public Customer (String username, String password, int points) {
        super(username, password);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
