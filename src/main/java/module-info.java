module com.javafx.demowebview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires jdk.jsobject;

    opens com.javafx.demowebview to javafx.fxml;
    exports com.javafx.demowebview;
}