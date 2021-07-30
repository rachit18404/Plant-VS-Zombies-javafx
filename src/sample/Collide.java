package sample;
import javafx.animation.*;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class Collide {

    ImageView peas;
    Zombie z;

    public Collide(ImageView peas,Zombie z ){
        this.peas=peas;
        this.z=z;


    }
    public void iscollide(int completion){
        ObservableBooleanValue colliding = Bindings.createBooleanBinding(new Callable<Boolean>() {

            @Override
            public Boolean call() throws Exception {
                return peas.getBoundsInParent().intersects(z.get().getBoundsInParent());
            }

            }, peas.boundsInParentProperty(), z.get().boundsInParentProperty());
            colliding.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs,Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    System.out.println("Colliding");
                    z.setHealth(z.getHealth()-10);
                    z.remove(completion);
                    peas.setX(27);

                } else {
                    System.out.println("Not colliding");
                }
            }
        });
    }
}
