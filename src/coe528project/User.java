package coe528project;

public abstract class User {
    private String username;
    private String password;
    
    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean verifyLogin(String username, String password){
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
}
