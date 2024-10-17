package org.example.bmicalculatorapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file and set the scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setTitle("BMI Calculator"); // Set the title of the window
        stage.setScene(scene); // Set the scene
        stage.show(); // Show the window
    }

    public static void main(String[] args) {
        launch(); // Launch the application
    }
}
