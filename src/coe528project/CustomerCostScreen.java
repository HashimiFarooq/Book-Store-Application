package coe528project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CustomerCostScreen //implements Initializable 
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    int currentCustomerIndex;
    double totalPrice;
    boolean withPoints;
    String usesPoints;
    
    @FXML
    private Label totalCost;
    
    @FXML
    private Button logoutButton;

    @FXML
    private Label status;

    @FXML
    private Label points;

    public void userLogout(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("LoginScreen.fxml");
    }

    /*@Override
    public void initialize(URL location, ResourceBundle resources)
    {
        try{
            Scanner file = new Scanner(new File("currentCustomer.txt"));
            currentCustomerIndex = file.nextInt();
            usesPoints = file.next();
            totalPrice = file.nextDouble();
        }catch(Exception e){
            usesPoints = "n";
            e.printStackTrace();
        }
        Customer c = CustomerFile.customers.get(currentCustomerIndex);
        if(usesPoints.equals("y")){
            if(c.getPoints() / 100 >= totalPrice){
                c.setPoints((int)Math.round(c.getPoints() - totalPrice * 100));
                totalPrice = 0;
            }
            else{
                totalPrice -= (double)(c.getPoints()) / 100.0;
                c.setPoints((int)Math.round(totalPrice * 10));
            }
        }
        else{
            c.setPoints((int)Math.round(c.getPoints() + totalPrice * 10));
        }
        totalCost.setText("Total Cost: " + totalPrice);
        if(c.getPoints() < 1000){
            status.setText("Status: Silver");
        }
        else{
            status.setText("Status: Gold");
        }
        points.setText("Points: " + c.getPoints());
        CustomerFile.customers.get(currentCustomerIndex).setPoints(c.getPoints());
        CustomerFile cf = CustomerFile.getInstance();
        
        cf.write();
    }*/
}