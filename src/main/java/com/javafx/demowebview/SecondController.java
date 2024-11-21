package com.javafx.demowebview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;

public class SecondController {
    @FXML
    private Label sLabel;

    @FXML
    private MenuButton mbType;

    @FXML
    private MenuItem menuItem3;

    protected void loadData (String id) {
        sLabel.setText(id);
    }

    @FXML
    protected void initialize() {
        MenuItem menuItem1 = new MenuItem("ООО");
        MenuItem menuItem2 = new MenuItem("ЗАО");

        mbType.getItems().addAll(menuItem1, menuItem2);

        menuItem1.setOnAction((e) -> {
            mbType.setText(menuItem1.getText());
        });

        menuItem2.setOnAction((e) -> {
            mbType.setText(menuItem2.getText());
        });

        menuItem3.setOnAction((e) -> {
            mbType.setText(menuItem3.getText());
        });


    }
}
