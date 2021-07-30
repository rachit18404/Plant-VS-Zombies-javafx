package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage pstage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        pstage=primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
            Scene p = new Scene(root,1324,768);
            p.getStylesheets().add(getClass().getResource("/sample/sample.css").toExternalForm());
            primaryStage.setTitle("Plant vs Zombies");
            primaryStage.setScene(p);
            primaryStage.show();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public Stage Return(){
        return pstage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
