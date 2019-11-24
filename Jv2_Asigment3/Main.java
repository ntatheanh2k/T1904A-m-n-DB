package Jv2_Asigment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("timer.fxml"));
            primaryStage.setTitle("Timer Countdown");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}