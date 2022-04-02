package coe528project;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    private static Stage stg;
    
    @Override
    public void start(Stage stage) throws Exception {
        FileIO.loadBooks();
        FileIO.loadCustomers();
        
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage.setResizable(false);
        Scene scene = new Scene(root, 750, 400);
        stage.setTitle("Book Store App");
        stage.setScene(scene);
        stage.show();
    }
    
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        
    }
    
    @Override
    public void stop(){
        System.out.println("closing");
        FileIO.saveBooks();
        FileIO.saveCustomers();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
