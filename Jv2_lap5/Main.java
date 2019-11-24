package Jv2_lap5;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage){
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
            primaryStage.setTitle("List Students");
            primaryStage.setScene(new Scene(root,600,600));
            primaryStage.show();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
