package coe528project;

public class OwnerCustomerTable {
        private String username;
        private String password;
        //private int points;
        
        public OwnerCustomerTable(String username, String password) {
            this.username = username;
            this.password = password;
        }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}