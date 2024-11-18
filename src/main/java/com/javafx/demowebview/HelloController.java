package com.javafx.demowebview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import netscape.javascript.JSObject;

public class HelloController {
    @FXML
    private WebView webView;
    @FXML
    private WebEngine webEngine;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

    }

    @FXML
    protected void initialize(){
        webEngine = webView.getEngine();
        webEngine.load(this.getClass().getResource("index.html").toExternalForm());
        webEngine.setUserStyleSheetLocation(this.getClass().getResource("style.css").toExternalForm());

        webEngine.getLoadWorker().stateProperty().addListener(
                new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue<? extends Worker.State> observableValue, Worker.State state, Worker.State t1) {
                        if (t1 == Worker.State.SUCCEEDED) {
                            JSObject jsObject = (JSObject) webEngine.executeScript("window");
                            jsObject.setMember("jHelper", new JavaHelper());
                        }
                    }
                }
        );

//        System.out.println(jsObject);

    }

    protected void reloadHandlers() {
//        webEngine = webView.getEngine();
//        webEngine.executeScript("add()");
    }
}