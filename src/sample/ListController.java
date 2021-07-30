package sample;

import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class ListController<bool> implements Initializable {

    @FXML
    private ListView listGames;
    HashMap<String, Level> savegames = new HashMap<String, Level>();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Main n= new Main();
        Stage primarystage=n.Return();
        File filename = new File("listofGames.txt");
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            savegames = (HashMap<String, Level>) in.readObject();
            in.close();
            file.close();
            for (String name : this.savegames.keySet()) {
                listGames.getItems().add(name);
            }
            listGames.addEventFilter(MouseEvent.MOUSE_PRESSED, e ->
            {
                if( e.isSecondaryButtonDown()) {
                    e.consume();


                    if (savegames.containsKey("rachit")){
                            Level ss=savegames.get("rachit");
                            System.out.println(ss);

                            try {
                                ss.open(primarystage);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }



                    }
                }
                });

            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        listGames.addEventFilter(ContextMenuEvent.CONTEXT_MENU_REQUESTED, Event::consume);

            listGames.getSelectionModel().selectedItemProperty().addListener(
                    (ChangeListener<String>) (observable, oldValue, newValue) -> System.out.println( "Item selected: " + observable + ", " + oldValue + ", " + newValue)


            );

            System.out.println("Object has been deserialized ");
        }


    }


