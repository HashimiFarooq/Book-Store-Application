package coe528project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class TestController implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private static Customer loggedIn;
    
    @FXML
    private Button logoutButton;
    @FXML
    private Button buyButton;
    @FXML
    private Button redeemPointsAndBuyButton;
    @FXML
    private Label welcomeMessage;
    @FXML
    private TableView<BookSelect> tableView;
    @FXML
    private TableColumn<BookSelect, String> bookName;
    @FXML
    private TableColumn<BookSelect, Double> bookPrice;
    @FXML
    private TableColumn<BookSelect, CheckBox> selectBook;
    
    ObservableList<BookSelect> list = FXCollections.observableArrayList();

    public void welcome(){
        welcomeMessage.setText("Welcome " + loggedIn.getUsername() + ". " + "You have "  + loggedIn.getPoints() + " points." + " Your status is " + loggedIn.getStatus() + ".");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
     
        /*for (int i = 0; i < 10; i++){
            CheckBox ch = new CheckBox("" + i);
            list.add(new BookSelect(i, "naesdasda", ch));
        
        }
        
        welcome();
        tableView.setItems(list);
        bookName.setCellValueFactory(new PropertyValueFactory<BookSelect, String>("name"));
        bookPrice.setCellValueFactory(new PropertyValueFactory<BookSelect, Double>("price"));
        selectBook.setCellValueFactory(new PropertyValueFactory<BookSelect, CheckBox>("checkBox"));*/
    
    }

    public void buyBook(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("CustomerCostScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("CustomerCostScreen.fxml");
     
    }
    
    public void redeemPointsAndBuyBook(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("CustomerCostScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("CustomerCostScreen.fxml");
     
    }
    
    
    public void userLogout(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("LoginScreen.fxml");
     
    }
    
    public static void setCustomer(Customer set){
        loggedIn = set;
    }
}
