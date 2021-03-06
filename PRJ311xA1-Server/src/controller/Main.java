package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public final String SERVER_NAME = "localhost";
    public final int PORT = 1234;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("../ui/ServerBox.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("../ui/ChatBox.fxml"));
        primaryStage.setTitle("Server Application");
//        primaryStage.setScene(new Scene(root, 250, 400));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        //start the server and ready for client's connection

    }


    public static void main(String[] args) {
        launch(args);
    }
}
