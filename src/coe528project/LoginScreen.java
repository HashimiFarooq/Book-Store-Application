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
        
        if(username.getText().equals("admin") && password.getText().equals("admin")){
            m.changeScene("OwnerStartScreen.fxml");
        }
        
        else if(username.getText().equals("customer") && password.getText().equals("customer")){
            m.changeScene("CustomerStartScreen.fxml");
        }
        
        
        else if(username.getText().isEmpty() || password.getText().isEmpty()){
            wrongLogin.setText("Please enter your username and password.");
        }
        
        else{
            wrongLogin.setText("Incorrect username or password!");
        }
    }
    
}
