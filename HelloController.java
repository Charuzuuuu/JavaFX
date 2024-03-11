package com.example.firstjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {
    @FXML
    private AnchorPane pnMain;

    @FXML
    private AnchorPane pnAnchor;

    @FXML
    private VBox pnLogin;
    @FXML
    private VBox pnHome;

    @FXML
    protected void onLogInClick() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
        //pnMain.getScene().getStylesheets().add(getClass().getResource("hello.css").toExternalForm());
        pnMain.getChildren().remove(pnLogin);
        pnMain.getChildren().add(root);
    }

    @FXML
    protected void onLogOutClick() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("hello.fxml"));
        //pnAnchor.getScene().getStylesheets().add(getClass().getResource("hello.css").toExternalForm());
        pnAnchor.getChildren().remove(pnHome);
        pnAnchor.getChildren().add(root);
    }

}
