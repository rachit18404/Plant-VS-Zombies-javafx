package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.Serializable;


public class Level implements Serializable {
    @FXML
    private Button one;
    private int level;
    private String username;
    Stage primarystage;
    private Game g;

    public void open(Stage primarystage) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("Level.fxml"));
        Scene p = new Scene(root,900,556);
        p.getStylesheets().add(getClass().getResource("/sample/sample.css").toExternalForm());
        primarystage.setScene(p);
        this.primarystage=primarystage;
        primarystage.show();
    }
    public void setname(String name){
        this.username=name;
    }
    public String getname(){
        return username;
    }
    public void chooseLevel() throws IOException, CloneNotSupportedException, InterruptedException {
        this.primarystage = (Stage) one.getScene().getWindow();
        Game g=new Game();
        this.g=g;
        g.play(primarystage,level);
    }
    public void playsave() throws InterruptedException, CloneNotSupportedException, IOException {
        System.out.println(getLevel());
        g.play(this.primarystage,1);
    }
    @FXML
    public int one(ActionEvent event) throws InterruptedException, CloneNotSupportedException, IOException {

        this.level=1;
        System.out.println(this.getname());
        chooseLevel();
        return level;

    }
    public int two(ActionEvent event) throws InterruptedException, CloneNotSupportedException, IOException {
        this.level=2;
        chooseLevel();
        return level;
    }
    public int three(ActionEvent event) throws InterruptedException, CloneNotSupportedException, IOException {
        this.level=3;
        chooseLevel();
        return level;
    }
    public int four(ActionEvent event) throws InterruptedException, CloneNotSupportedException, IOException {
        this.level=4;
        chooseLevel();
        return level;
    }
    public int five(ActionEvent event) throws InterruptedException, CloneNotSupportedException, IOException {
        this.level=5;
        chooseLevel();
        return level;
    }


    public int getLevel(){
        return level;
    }
}
