package coe528project;

public class Customer extends User{
    
    private int points;
    
    public Customer (String username, String password, int points) {
        super(username, password);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
    
    public String getStatus(){
        if (points >= 1000){
            return "Gold";
        }
        return "Silver";
    }
    
    public void addPoints(int points){
        this.points += points;
    }
    
    public void deductPoints(int points){
        this.points -= points;
    }
}
