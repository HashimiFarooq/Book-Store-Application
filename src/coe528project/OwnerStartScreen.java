package coe528project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OwnerStartScreen {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button logoutButton;
    @FXML
    private Button booksButton;
    @FXML
    private Button customersButton;
    
    
    public void userLogout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
     
    }
    
    public void books(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerBookScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void customers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerCustomerScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
}

