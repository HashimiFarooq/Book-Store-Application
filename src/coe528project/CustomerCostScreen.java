package coe528project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CustomerCostScreen{
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button logoutButton;
    @FXML
    private TextField totalCost;
    @FXML
    private TextField points;
    @FXML
    private TextField status;
    
    
    public void userLogout(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("LoginScreen.fxml");
     
    }

}

