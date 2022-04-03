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
    
    public int deductPoints(int points){
        if (points > this.points){
            int remainder = points - this.points;
            this.points = 0;
            return remainder;
        }
        
        this.points -= points;
        
        return 0;
    }
}
