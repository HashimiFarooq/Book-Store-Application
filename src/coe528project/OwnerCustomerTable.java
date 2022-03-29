package coe528project;

public class OwnerCustomerTable {
        private String username;
        private int password;
        //private int points;
        
        public OwnerCustomerTable(String username, int password) {
            this.username = username;
            this.password = password;
        }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
   
}