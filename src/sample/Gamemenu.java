package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Gamemenu {
    @FXML
    private Button exit;
    public void open(Stage primarystage) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("Gamemenu.fxml"));
        Scene p = new Scene(root,900,556);
        p.getStylesheets().add(getClass().getResource("/sample/sample.css").toExternalForm());
        primarystage.setScene(p);
        primarystage.show();
    }
    public void exit() throws IOException {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primarystage.setScene(new Scene(root));
        primarystage.show();
    }
    public void save() throws IOException {

        Level l=new Level();
        l.setname("rachit");
        Serial.serialize(l);
        Stage primarystage = (Stage) exit.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primarystage.setScene(new Scene(root));
        primarystage.show();
    }
}
