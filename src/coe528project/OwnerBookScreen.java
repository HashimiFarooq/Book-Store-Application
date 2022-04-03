package coe528project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class OwnerBookScreen implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    //Table
    @FXML
    private TableView<Book> tableView;
    //columns
    @FXML
    private TableColumn<Book, String> bookName;
    @FXML
    private TableColumn<Book, Double> bookPrice;
    //InputText
    @FXML
    private TextField bookPriceIn;
    @FXML
    private TextField bookNameIn;
    //Buttons
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button backButton;
    
    //OWNER BOOK SCREEN
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
        bookPrice.setCellValueFactory(new PropertyValueFactory<Book, Double>("price"));
        
        for (int i = 0; i < FileIO.books.size(); i++){
            Book book = FileIO.books.get(i);
            
            tableView.getItems().add(book);
        }
    }
    
    @FXML
    void addBook(ActionEvent event){
        Book bookTable = new Book(bookNameIn.getText(),
        Double.parseDouble(bookPriceIn.getText()));
        ObservableList<Book> bookTables = tableView.getItems();
        FileIO.books.add(bookTable);
        bookTables.add(bookTable);
        tableView.setItems(bookTables);
    }
    
    @FXML 
    void removeBook(ActionEvent event){
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        FileIO.books.remove(selectedID);
        tableView.getItems().remove(selectedID);
    }
    
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerStartScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //---------------------------------------------------------------------
    
    
    
}
