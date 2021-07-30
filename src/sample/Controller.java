package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
public class Controller implements Serializable{
    @FXML
    private TextField name;
    @FXML
    private Button ResumeButton;
    @FXML
    private RadioButton start;
    @FXML
    private Button chooselevel;
    public void NewGame(ActionEvent event) throws IOException {
        Main n= new Main();
        Stage primarystage=n.Return();
        Parent root1 = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
        primarystage.setTitle("Account");
        Scene p = new Scene(root1,720,360);
        p.getStylesheets().add(getClass().getResource("/sample/sample.css").toExternalForm());
        primarystage.setScene(p);
        primarystage.show();
    }

    public void ResumeGame() throws IOException {
        Stage primarystage = (Stage) ResumeButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("listofGames.fxml"));
        primarystage.setScene(new Scene(root));
        primarystage.show();
    }

    public void Login() throws IOException, InterruptedException, CloneNotSupportedException {
        Stage primarystage = (Stage) start.getScene().getWindow();
        String username=name.getText();

        //Game g=new Game();
        //g.setname(username);
        //Serial.serialize(g);
        //g.play(primarystage);
        Level l=new Level();
        l.setname(username);
        Serial.serialize(l);
        l.open(primarystage);
    }

    public void setChooselevel() throws IOException {
        Stage primarystage = (Stage) chooselevel.getScene().getWindow();
        Level l=new Level();
        l.open(primarystage);
    }


    public void exit(ActionEvent event){
        System.exit(0);
    }



}

