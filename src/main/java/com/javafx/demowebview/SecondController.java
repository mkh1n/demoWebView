package com.javafx.demowebview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondController {
    @FXML
    private Label sLabel;

    protected void loadData (String id) {
        sLabel.setText(id);
    }
}
