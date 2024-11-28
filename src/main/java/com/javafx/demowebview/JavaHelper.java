package com.javafx.demowebview;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class JavaHelper {
    public void openStage(String id, String type) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SecondController.class.getResource("second.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 480, 480);
        Stage stage = new Stage();
        stage.setTitle("Second");
        stage.setScene(scene);
//        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            @Override
//            public void handle(WindowEvent windowEvent) {
//                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                alert.setTitle("Safe?");
//                alert.setHeaderText("Confirm close window");
//                alert.setContentText("Are you sure?");
//                ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);
//                if (result == ButtonType.CANCEL) {
//                    windowEvent.consume();
//                } else if (result == ButtonType.OK) {
//                    System.out.println("Save to DB.... =)))");
//                    HelloController helloController = new HelloController();
//                    helloController.reloadHandlers();
//                }
//                System.out.println(result);
//            }
//        });
        SecondController secondController = fxmlLoader.getController();
        secondController.loadData(id, type);
        stage.show();


    }

    public void debuger(String string){
        System.out.println(string);
    }
}
