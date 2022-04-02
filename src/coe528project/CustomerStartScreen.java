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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CustomerStartScreen implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private static Customer customer;
    
    @FXML
    private Button logoutButton;
    @FXML
    private Button buyButton;
    @FXML
    private Button redeemPointsAndBuyButton;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<Book, String> bookName;
    @FXML
    private TableColumn<Book, Double> bookPrice;
    @FXML
    private TableColumn<Book, Boolean> selectBook;
    

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<>("name"));
        bookPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        for (int i = 0; i < FileIO.books.size(); i++){
            Book book = FileIO.books.get(i);
            
            tableView.getItems().add(book);
        }
        
        selectBook.setCellValueFactory(new PropertyValueFactory<Book, Boolean>("username"));
    }
    public void buyBook(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("LoginScreen.fxml");
     
    }
    
    public void redeemPointsAndBuyBook(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("LoginScreen.fxml");
     
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
        customer = set;
    }
}

