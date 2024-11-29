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
        // SELECT * FROM SUPPLIERS WHERE ID = {ID};
        System.out.println("Запрос к БД по id " + id);
        Suppliers suppliers = new Suppliers(1, "OOO", "Луговой", "88005553535",
                "10", "Universe");
        sLabel.setText(suppliers.getName());

    }

    @FXML
    protected void saveData () {
        String name = sLabel.getText();
        // Suppliers suppliers = new Suppliers();
        System.out.println("Пользователь с идентификатором " + sLabel + " обновлен");
        SuppliersDAO sd = new SuppliersDAO();
//        sd.connect();
//        sd.updateSuppliers();
//        sd.disconnect();
        // UPDATE or CREATE  в зависимости от наличия id
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
