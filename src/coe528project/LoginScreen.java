package coe528project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.File;

public class LoginScreen {
    
    public LoginScreen(){
        
    }
    
    @FXML
    private Label loginLabel;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;
    @FXML
    private Label wrongLogin;
    
    @FXML
    private void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }
    
    private void checkLogin() throws IOException{
        
        Main m = new Main();
        
        String user = username.getText();
        String pass = password.getText();
        
        if(username.getText().equals("admin") && password.getText().equals("admin")){
            m.changeScene("OwnerStartScreen.fxml");
        }
        
        for (int i = 0; i < FileIO.customers.size(); i++){
            if (FileIO.customers.get(i).verifyLogin(user, pass)){
                m.changeScene("CustomerStartScreen.fxml");
                return;
            }
        }
        
        
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            wrongLogin.setText("Please enter your username and password.");
        }
        
        else{
            wrongLogin.setText("Incorrect username or password!");
        }
    }
    
}
