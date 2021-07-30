package sample;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;


public class Zombie extends Node {

    private int completion;
    private int health=100;
    private Image Zombie= new Image("/images/normalZombie.png");
    private ImageView zombieView=new ImageView(Zombie);
    private Image Zombief=new Image("/images/zombie_football.gif");
    private  ImageView zombiefoot=new ImageView(Zombief);
    Random r =new Random();
    public void setZombie(){
        this.zombieView=zombiefoot;
    }


    public ImageView get(){
        return zombieView;
    }
    public void setLayout(){
        int a=r.nextInt(5);
        get().setLayoutX(870);
        get().setLayoutY(28+a*85);

    }
    public void setHealth(int health){
        this.health=health;
    }

    public int getHealth(){
        return this.health;
    }

    public void remove(int completion){
        if (getHealth()==0) {
            this.completion=completion;
            get().setLayoutX(10000);
            get().setLayoutY(10000);
            this.completion++;
            System.out.println(getcompletion());

        }
    }
    public int getcompletion(){
        return this.completion;
    }



}
