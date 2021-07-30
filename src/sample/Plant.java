package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;


public class Plant {
    private Image Plant= new Image("/images/normalZombie.png");
    private ImageView PlantView=new ImageView(Plant);
    public ImageView get(){
        return PlantView;
    }
    public void setLayout(){
        get().setLayoutX(26);
        get().setLayoutY(48);
    }
}
