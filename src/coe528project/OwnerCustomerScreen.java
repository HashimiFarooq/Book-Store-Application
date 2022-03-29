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

public class OwnerCustomerScreen implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    //Table
    @FXML
    private TableView<OwnerCustomerTable> tableView;
    //columns
    @FXML
    private TableColumn<OwnerCustomerTable, String> usernameCol;
    @FXML
    private TableColumn<OwnerCustomerTable, Integer> passwordCol;
    @FXML
    private TableColumn<OwnerCustomerTable, Integer> pointsCol;
    //InputText
    @FXML
    private TextField usernameIn;
    @FXML
    private TextField passwordIn;
    //Buttons
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button backButton;
    
    //OWNER Customer SCREEN
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameCol.setCellValueFactory(new PropertyValueFactory<OwnerCustomerTable, String>("username"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<OwnerCustomerTable, Integer>("password"));
        //pointsCol.setCellValueFactory(new PropertyValueFactory<OwnerCustomerTable, Integer>("points"));
    }
    
    @FXML
    void registerUser(ActionEvent event){
        OwnerCustomerTable customerTable = new OwnerCustomerTable(usernameIn.getText(),
                Integer.parseInt(passwordIn.getText()));
        ObservableList<OwnerCustomerTable> customerTables = tableView.getItems();
        customerTables.add(customerTable);
        tableView.setItems(customerTables);
    }
    
    @FXML 
    void removeUser(ActionEvent event){
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }
    
    
    public void back(ActionEvent event) throws IOException {
        Main m = new Main();
        Parent root = FXMLLoader.load(getClass().getResource("OwnerStartScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        m.changeScene("OwnerStartScreen.fxml");
    }
    //---------------------------------------------------------------------
}
