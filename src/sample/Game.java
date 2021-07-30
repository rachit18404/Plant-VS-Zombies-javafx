package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import java.util.concurrent.atomic.AtomicBoolean;


public class Game implements Serializable,Cloneable,Initializable{
    int a;
    private String name;
    private double startDragX;
    private double startDragY;
    int completion=0;
    int level;


    @FXML
    private ProgressBar time;
    @FXML
    private Button pause;
    @FXML
    private Label scoretoken;

    Zombie z1 = new Zombie();
    Zombie z2=new Zombie();
    Zombie z3=new Zombie();
    Zombie z4=new Zombie();
    Zombie z5=new Zombie();
    Zombie z6=new Zombie();
    Zombie z7=new Zombie();
    Zombie z8=new Zombie();
    Zombie z9=new Zombie();
    Zombie z10=new Zombie();
    Zombie zf1=new Zombie();
    Zombie zf2=new Zombie();
    Zombie zf3=new Zombie();
    Zombie zf4=new Zombie();


    public void setname(String username){
        this.name=username;
    }
    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
    public String getname(){
        return this.name;
    }
    public void play(Stage primarystage,int level) throws IOException, InterruptedException, CloneNotSupportedException {
        this.level=level;
        System.out.println(level);
        Pane root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Image shooter= new Image("/images/peashooter.gif");
        ImageView peashooter=new ImageView(shooter);
        peashooter.setFitHeight(46);
        peashooter.setFitWidth(55);
        root.getChildren().add(peashooter);
        peashooter.setLayoutX(6);
        peashooter.setLayoutY(89);

        Label sss=new Label();
        sss.setText("0");
        sss.getTextFill();
        sss.setLayoutX(26);
        sss.setLayoutY(53);
        root.getChildren().add(sss);

        if (level==1) {
        }


            root.getChildren().add(z1.get());
            root.getChildren().add(z2.get());
            root.getChildren().add(z3.get());
            root.getChildren().add(z4.get());
            root.getChildren().add(z5.get());
            root.getChildren().add(z6.get());
            root.getChildren().add(z7.get());
            root.getChildren().add(z8.get());
            root.getChildren().add(z9.get());
            root.getChildren().add(z10.get());
            z1.setLayout();
            z2.setLayout();
            z3.setLayout();
            z4.setLayout();
            z5.setLayout();
            z6.setLayout();
            z7.setLayout();
            z8.setLayout();
            z9.setLayout();
            z10.setLayout();
            zf1.setZombie();
            zf1.get().setLayoutX(870);
            zf1.get().setLayoutY(85+28);
            zf1.get().setFitHeight(66);
            zf1.get().setFitWidth(75);

            zf2.setZombie();
            zf2.setLayout();
            zf2.get().setFitHeight(66);
            zf2.get().setFitWidth(75);

            zf3.setZombie();
            zf3.setLayout();
            zf3.get().setFitHeight(66);
            zf3.get().setFitWidth(75);


            zf4.setZombie();
            zf4.setLayout();
            zf4.get().setFitHeight(66);
            zf4.get().setFitWidth(75);

            Timeline zombieline1=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z1.get().setX(z1.get().getX()-1.5);
            }));
            zombieline1.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition1 = new SequentialTransition (
                    new PauseTransition(Duration.millis(12000)), zombieline1);
            seqTransition1.play();


            Timeline zombieline2=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z2.get().setX(z2.get().getX()-1.5);
            }));
            zombieline2.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition2 = new SequentialTransition (
                    new PauseTransition(Duration.millis(18000)), zombieline2);
            seqTransition2.play();



            Timeline zombieline3=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z3.get().setX(z3.get().getX()-1.5);
            }));
            zombieline3.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition3 = new SequentialTransition (
                    new PauseTransition(Duration.millis(24000)), zombieline3);
            seqTransition3.play();


            Timeline zombieline4=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z4.get().setX(z4.get().getX()-1.5);
            }));
            zombieline4.setCycleCount(Animation.INDEFINITE);

            SequentialTransition seqTransition4 = new SequentialTransition (
                    new PauseTransition(Duration.millis(30000)), zombieline4);
            seqTransition4.play();


            Timeline zombieline5=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z5.get().setX(z5.get().getX()-1.5);
            }));
            zombieline5.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition5 = new SequentialTransition (
                    new PauseTransition(Duration.millis(36000)), zombieline5);
            seqTransition5.play();




            Timeline zombieline6=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z6.get().setX(z6.get().getX()-1.5);
            }));
            zombieline1.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition6 = new SequentialTransition (
                    new PauseTransition(Duration.millis(42000)), zombieline6);
            seqTransition6.play();




            Timeline zombieline7=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z7.get().setX(z7.get().getX()-1.5);
            }));
            zombieline7.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition7 = new SequentialTransition (
                    new PauseTransition(Duration.millis(48000)), zombieline7);
            seqTransition7.play();



            Timeline zombieline8=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z8.get().setX(z8.get().getX()-1.5);
            }));
            zombieline8.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition8 = new SequentialTransition (
                    new PauseTransition(Duration.millis(54000)), zombieline8);
            seqTransition8.play();


            Timeline zombieline9=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z9.get().setX(z9.get().getX()-1.5);
            }));
            zombieline9.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition9 = new SequentialTransition (
                    new PauseTransition(Duration.millis(60000)), zombieline9);
            seqTransition9.play();


            Timeline zombieline10=new Timeline(new KeyFrame(
                    Duration.millis(50),(evt) ->{
                z10.get().setX(z10.get().getX()-1.5);
            }));
            zombieline10.setCycleCount(Animation.INDEFINITE);
            SequentialTransition seqTransition10 = new SequentialTransition (
                    new PauseTransition(Duration.millis(66000)), zombieline10);
            seqTransition10.play();

        Timeline zombielinef1=new Timeline(new KeyFrame(

                Duration.millis(50),(evt) ->{
            zf1.get().setX(zf1.get().getX()-1.5);
        }));
        zombielinef1.setCycleCount(Animation.INDEFINITE);
        SequentialTransition seqTransitionzf1 = new SequentialTransition (
                new PauseTransition(Duration.millis(14000)), zombielinef1);
        seqTransitionzf1.play();


        Timeline zombielinef2=new Timeline(new KeyFrame(

                Duration.millis(50),(evt) ->{
            zf2.get().setX(zf2.get().getX()-1.5);
        }));
        zombielinef2.setCycleCount(Animation.INDEFINITE);
        SequentialTransition seqTransitionzf2 = new SequentialTransition (
                new PauseTransition(Duration.millis(10000)), zombielinef2);
        seqTransitionzf2.play();


        Timeline zombielinef3=new Timeline(new KeyFrame(

                Duration.millis(50),(evt) ->{
            zf3.get().setX(zf3.get().getX()-1.5);
        }));
        zombielinef1.setCycleCount(Animation.INDEFINITE);
        SequentialTransition seqTransitionzf3 = new SequentialTransition (
                new PauseTransition(Duration.millis(23000)), zombielinef3);
        seqTransitionzf3.play();


        Timeline zombielinef4=new Timeline(new KeyFrame(

                Duration.millis(50),(evt) ->{
            zf4.get().setX(zf4.get().getX()-1.5);
        }));
        zombielinef4.setCycleCount(Animation.INDEFINITE);
        SequentialTransition seqTransitionzf4 = new SequentialTransition (
                new PauseTransition(Duration.millis(3000)), zombielinef4);
        seqTransitionzf4.play();

        Image sun_flower= new Image("/images/sun_flower.gif");
        ImageView sunf=new ImageView(sun_flower);
        sunf.setFitHeight(46);
        sunf.setFitWidth(55);
        sunf.setLayoutX(6);
        sunf.setLayoutY(149);
        if (level==2){
            root.getChildren().add(sunf);
            root.getChildren().add(zf1.get());root.getChildren().add(zf2.get());root.getChildren().add(zf4.get());
        }

        Image walnut= new Image("/images/walnut_full_life.gif");
        ImageView wal=new ImageView(walnut);
        wal.setFitHeight(46);
        wal.setFitWidth(55);

        wal.setLayoutX(6);
        wal.setLayoutY(199);
        if (level==3){
            root.getChildren().add(sunf);
            root.getChildren().add(wal);
            root.getChildren().add(zf1.get());root.getChildren().add(zf2.get());root.getChildren().add(zf4.get());
        }
        if(level==4){
            root.getChildren().add(sunf);
            root.getChildren().add(wal);
            root.getChildren().add(zf1.get());root.getChildren().add(zf2.get());root.getChildren().add(zf4.get());
        }
        if (level==5){
            root.getChildren().add(sunf);
            root.getChildren().add(wal);
            root.getChildren().add(zf1.get());root.getChildren().add(zf2.get());root.getChildren().add(zf4.get());
        }
        Scene p = new Scene(root,900,556);
        p.getStylesheets().add(getClass().getResource("/sample/sample.css").toExternalForm());
        primarystage.setScene(p);
        Image sun=new Image("/images/sun.gif");
        ImageView suntoken=new ImageView(sun);
        root.getChildren().add(suntoken);
        suntoken.setLayoutX(400);
        suntoken.setLayoutY(0);
        suntoken.setOnMousePressed(e ->{
            this.a=this.a+25;
            System.out.println(a);
            sss.setText(Integer.toString(a));
        });

        TranslateTransition transitionsun = new TranslateTransition();
        transitionsun.setDuration(Duration.seconds(10));
        transitionsun.setToX(300);
        transitionsun.setToY(600);
        transitionsun.setCycleCount(10);
        transitionsun.setNode(suntoken);
        transitionsun.play();
        primarystage.show();
            test(root, peashooter,sunf,wal);

            Image lawn = new Image(getClass().getResource("/images/lawn_mower.gif").toExternalForm());
            TranslateTransition lawntransition = new TranslateTransition();
            lawntransition.setDuration(Duration.millis(5000));
            lawntransition.setToX(800);
            ImageView lawnmover1=new ImageView(lawn);
            root.getChildren().add(lawnmover1);
            lawnmover1.setLayoutX(165);
            lawnmover1.setLayoutY(20);
            ImageView lawnmover2=new ImageView(lawn);
            root.getChildren().add(lawnmover2);
            lawnmover2.setLayoutX(165);
            lawnmover2.setLayoutY(120);
            lawntransition.setNode(lawnmover2);
            SequentialTransition lawntransitiont = new SequentialTransition (
                new PauseTransition(Duration.millis(35000)), lawntransition);
             lawntransitiont.play();
            Lawncollide l1=new Lawncollide(lawnmover2,z1);
            l1.iscollide(2);
            Lawncollide l2=new Lawncollide(lawnmover2,z2);
            l2.iscollide(2);
            Lawncollide l3=new Lawncollide(lawnmover2,z3);
            l3.iscollide(2);
            Lawncollide l4=new Lawncollide(lawnmover2,z4);
            l4.iscollide(2);
            Lawncollide l5=new Lawncollide(lawnmover2,z5);
            l5.iscollide(2);
            Lawncollide l6=new Lawncollide(lawnmover2,z6);
            l6.iscollide(2);
            Lawncollide l7=new Lawncollide(lawnmover2,z7);
            l7.iscollide(2);
            Lawncollide l8=new Lawncollide(lawnmover2,z8);
            l8.iscollide(2);
            Lawncollide l9=new Lawncollide(lawnmover2,z9);
            l9.iscollide(2);
            Lawncollide l10=new Lawncollide(lawnmover2,z10);
            l10.iscollide(2);
            Lawncollide lf1=new Lawncollide(lawnmover2,zf1);
            lf1.iscollide(2);
            Lawncollide lf2=new Lawncollide(lawnmover2,zf2);
            lf2.iscollide(2);
            Lawncollide lf4=new Lawncollide(lawnmover2,zf4);
            lf4.iscollide(2);

            ImageView lawnmover3=new ImageView(lawn);
            root.getChildren().add(lawnmover3);
            lawnmover3.setLayoutX(165);
            lawnmover3.setLayoutY(220);
            ImageView lawnmover4=new ImageView(lawn);
            root.getChildren().add(lawnmover4);
            lawnmover4.setLayoutX(165);
            lawnmover4.setLayoutY(320);
            lawntransition.setNode(lawnmover2);

            ImageView lawnmover5=new ImageView(lawn);
            root.getChildren().add(lawnmover5);
            lawnmover5.setLayoutX(165);
            lawnmover5.setLayoutY(420);





    }

    public void setSuntoken(){

    }





    public void test(Pane root, ImageView peashooter,ImageView sunf,ImageView wal) throws CloneNotSupportedException{

        wal.setOnMousePressed(e -> {
            startDragX = e.getSceneX();
            startDragY = e.getSceneY();
            System.out.println(e.getSceneX() + " " + e.getSceneY());
        });
        wal.setOnMouseReleased(e -> {
                    wal.setTranslateX(e.getSceneX() - startDragX);
                    wal.setTranslateY(e.getSceneY() - startDragY);
                    System.out.println(e.getSceneX() + " " + e.getSceneY());
                    if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                        wal.setTranslateX(275 - startDragX);
                        wal.setTranslateY(60 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }
                    }



            else if (e.getSceneX() > 232+65 && e.getSceneX() < 232 + 65+65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                wal.setTranslateX(275+65 - startDragX);
                wal.setTranslateY(60 - startDragY);
                wal.setOnMousePressed(null);
                wal.setOnMouseReleased(null);
                Image walnut1 = new Image("/images/walnut_full_life.gif");
                ImageView wal1 = new ImageView(walnut1);
                wal1.setFitHeight(46);
                wal1.setFitWidth(55);
                wal1.setLayoutX(6);
                wal1.setLayoutY(199);
                root.getChildren().add(wal1);

                try {
                    test(root, peashooter, sunf, wal1);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }

                    else if (e.getSceneX() > 232+65 && e.getSceneX() < 232 + 65+65 && e.getSceneY() > 120 && e.getSceneY() < 20 + 200) {
                        wal.setTranslateX(275+65 - startDragX);
                        wal.setTranslateY(130 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }


                    else if (e.getSceneX() > 232+65+65 && e.getSceneX() < 232 + 65+65+65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                        wal.setTranslateX(275+65+65 - startDragX);
                        wal.setTranslateY(60 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }

                    else if (e.getSceneX() > 232+65+65 && e.getSceneX() < 232 + 65+65+65 && e.getSceneY() > 120 && e.getSceneY() < 20 + 200) {
                        wal.setTranslateX(275+65+65 - startDragX);
                        wal.setTranslateY(130 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }

                    else if (e.getSceneX() > 232+65+65 && e.getSceneX() < 232 + 65+65+65 && e.getSceneY() > 220 && e.getSceneY() < 20 + 300) {
                        wal.setTranslateX(275+65+65 - startDragX);
                        wal.setTranslateY(230 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }

                    else if (e.getSceneX() > 232+65+65 && e.getSceneX() < 232 + 65+65+65 && e.getSceneY() > 320 && e.getSceneY() < 20 + 360) {
                        wal.setTranslateX(275+65+65 - startDragX);
                        wal.setTranslateY(360 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }

                    else if (e.getSceneX() > 232+65 && e.getSceneX() < 232 + 65+65 && e.getSceneY() > 220 && e.getSceneY() < 20 + 300) {
                        wal.setTranslateX(275+65 - startDragX);
                        wal.setTranslateY(230 - startDragY);
                        wal.setOnMousePressed(null);
                        wal.setOnMouseReleased(null);
                        Image walnut1 = new Image("/images/walnut_full_life.gif");
                        ImageView wal1 = new ImageView(walnut1);
                        wal1.setFitHeight(46);
                        wal1.setFitWidth(55);
                        wal1.setLayoutX(6);
                        wal1.setLayoutY(199);
                        root.getChildren().add(wal1);

                        try {
                            test(root, peashooter, sunf, wal1);
                        } catch (CloneNotSupportedException ex) {
                            ex.printStackTrace();
                        }

                    }




                });



        sunf.setOnMousePressed(e -> {
            startDragX = e.getSceneX();
            startDragY = e.getSceneY();

            System.out.println(e.getSceneX() + " " + e.getSceneY());
        });
        sunf.setOnMouseReleased(e -> {
            sunf.setTranslateX(e.getSceneX() - startDragX);
            sunf.setTranslateY(e.getSceneY() - startDragY);
            System.out.println(e.getSceneX() + " " + e.getSceneY());
            if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                sunf.setTranslateX(275 - startDragX);
                sunf.setTranslateY(60 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }
            else if (e.getSceneX() > 232 + 65 && e.getSceneX() < 232 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 120) {
                sunf.setTranslateX(275 + 65 - startDragX);
                sunf.setTranslateY(60 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }

            else if (e.getSceneX() > 232+65  && e.getSceneX() < 232 + 65+65  && e.getSceneY() > 120 && e.getSceneY() < 20 + 200) {
                sunf.setTranslateX(275 + 65 - startDragX);
                sunf.setTranslateY(130 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }
            else if (e.getSceneX() > 232+65  && e.getSceneX() < 232 + 65+65  && e.getSceneY() > 220 && e.getSceneY() < 20 + 300) {
                sunf.setTranslateX(275 + 65 - startDragX);
                sunf.setTranslateY(230 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }
            else if (e.getSceneX() > 232+65  && e.getSceneX() < 232 + 65+65  && e.getSceneY() > 320 && e.getSceneY() < 380) {
                sunf.setTranslateX(275 + 65 - startDragX);
                sunf.setTranslateY(300 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }

            else if (e.getSceneX() > 232 +65 && e.getSceneX() < 232 + 65+65  && e.getSceneY() > 380 && e.getSceneY() < 20 + 500) {
                sunf.setTranslateX(275 + 65 - startDragX);
                sunf.setTranslateY(380 - startDragY);
                sunf.setOnMousePressed(null);
                sunf.setOnMouseReleased(null);
                Image sun1 = new Image("/images/sun_flower.gif");
                ImageView sunf1 = new ImageView(sun1);
                sunf1.setFitHeight(36);
                sunf1.setFitWidth(45);
                sunf1.setLayoutX(6);
                sunf1.setLayoutY(149);
                root.getChildren().add(sunf1);

                try {
                    test(root, peashooter,sunf1,wal);
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();
                }

            }



        }
                );


            peashooter.setOnMousePressed(e -> {
                startDragX = e.getSceneX();
                startDragY = e.getSceneY();
                System.out.println(e.getSceneX() + " " + e.getSceneY());
            });
            peashooter.setOnMouseReleased(e -> {
                        peashooter.setTranslateX(e.getSceneX() - startDragX);
                        peashooter.setTranslateY(e.getSceneY() - startDragY);
                        System.out.println(e.getSceneX() + " " + e.getSceneY());
                        if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(60);
                            peas.setLayoutX(275);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                        peas.setX(peas.getX()+1.5);
                                        if (peas.getX()>600){
                                            peas.setX(27);
                                        }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();




                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);


                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);


                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }
                            peashooter.setOnMousePressed(null);
                            peashooter.setOnMouseReleased(null);

                        }
                        else if (e.getSceneX() > 232 + 65 && e.getSceneX() < 232 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(60);
                            peas.setLayoutX(275+65);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();




                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);
                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);

                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }


                        } else if (e.getSceneX() > 232 + 65 + 65 && e.getSceneX() < 232 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(60);
                            peas.setLayoutX(275+65+65);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();




                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);

                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);

                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }
                            peashooter.setOnMousePressed(null);
                            peashooter.setOnMouseReleased(null);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        } else if (e.getSceneX() > 232 + 65 + 65 + 65 && e.getSceneX() < 232 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(60);
                            peas.setLayoutX(275+65+65+65);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();




                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);
                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);

                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }
                            peashooter.setOnMousePressed(null);
                            peashooter.setOnMouseReleased(null);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        }

                else if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 120 && e.getSceneY() < 20 + 200) {
                    peashooter.setTranslateX(275 - startDragX);
                    peashooter.setTranslateY(130 - startDragY);
                    System.out.println(e.getSceneX() + " " + e.getSceneY());
                    Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                    ImageView peas = new ImageView(pea);
                    root.getChildren().add(peas);
                    peas.setLayoutY(130);
                    peas.setLayoutX(275);
                    Timeline pealine=new Timeline(new KeyFrame(
                            Duration.millis(10),(evt) -> {
                        peas.setX(peas.getX()+1.5);
                        if (peas.getX()>600){
                            peas.setX(27);
                        }
                    }

                    ));
                    pealine.setCycleCount(Animation.INDEFINITE);
                    pealine.play();

                    Collide c1= new Collide(peas,z1);
                    c1.iscollide(completion);
                    this.completion=z1.getcompletion();

                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);


                    Collide c2= new Collide(peas,z2);
                    c2.iscollide(completion);
                    this.completion=z1.getcompletion();
                    System.out.println("sdfdsf"+completion);

                    Collide c3= new Collide(peas,z3);
                    c3.iscollide(completion);
                    this.completion=z1.getcompletion();
                    System.out.println("sdfdsf"+completion);

                    Collide c4= new Collide(peas,z4);
                    c4.iscollide(completion);
                    this.completion=z1.getcompletion();
                    System.out.println("sdfdsf"+completion);


                    Collide c5= new Collide(peas,z5);
                    c5.iscollide(completion);
                    this.completion=z1.getcompletion();

                    Collide c6= new Collide(peas,z6);
                    c6.iscollide(completion);
                    this.completion=z1.getcompletion();

                    Collide c7= new Collide(peas,z7);
                    c7.iscollide(completion);

                    Collide c8= new Collide(peas,z8);
                    c8.iscollide(completion);

                    Collide c9= new Collide(peas,z9);
                    c9.iscollide(completion);

                    Collide c10= new Collide(peas,z10);
                    c10.iscollide(completion);


                    Image shooter= new Image("/images/peashooter.gif");
                    ImageView peashooter1=new ImageView(shooter);
                    root.getChildren().add(peashooter1);
                    peashooter1.setLayoutX(6);
                    peashooter1.setLayoutY(89);
                    peashooter1.setFitHeight(46);
                    peashooter1.setFitWidth(55);
                    try {
                        test(root, peashooter1,sunf,wal);
                    } catch (CloneNotSupportedException ex) {
                        ex.printStackTrace();
                    }
                            peashooter.setOnMousePressed(null);
                            peashooter.setOnMouseReleased(null);

                }


                        else if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 220 && e.getSceneY() < 20 + 300) {
                            peashooter.setTranslateX(275 - startDragX);
                            peashooter.setTranslateY(230 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(230);
                            peas.setLayoutX(275);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();




                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);

                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);


                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }

                        }

                        else if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 320 && e.getSceneY() < 20 + 400) {
                            peashooter.setTranslateX(275 - startDragX);
                            peashooter.setTranslateY(300 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(300);
                            peas.setLayoutX(275);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);


                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);


                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }

                        }
                        else if (e.getSceneX() > 232 && e.getSceneX() < 232 + 65 && e.getSceneY() > 420 && e.getSceneY() < 20 + 500) {
                            peashooter.setTranslateX(275 - startDragX);
                            peashooter.setTranslateY(380 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                            Image pea = new Image(getClass().getResource("pea.png").toExternalForm());
                            ImageView peas = new ImageView(pea);
                            root.getChildren().add(peas);
                            peas.setLayoutY(380);
                            peas.setLayoutX(275);
                            Timeline pealine=new Timeline(new KeyFrame(
                                    Duration.millis(10),(evt) -> {
                                peas.setX(peas.getX()+1.5);
                                if (peas.getX()>600){
                                    peas.setX(27);
                                }
                            }

                            ));
                            pealine.setCycleCount(Animation.INDEFINITE);
                            pealine.play();

                            Collide c1= new Collide(peas,z1);
                            c1.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide cf2= new Collide(peas,zf2);
                            cf2.iscollide(completion);

                            Collide cf4= new Collide(peas,zf4);
                            cf4.iscollide(completion);


                            Collide c2= new Collide(peas,z2);
                            c2.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c3= new Collide(peas,z3);
                            c3.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);

                            Collide c4= new Collide(peas,z4);
                            c4.iscollide(completion);
                            this.completion=z1.getcompletion();
                            System.out.println("sdfdsf"+completion);


                            Collide c5= new Collide(peas,z5);
                            c5.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c6= new Collide(peas,z6);
                            c6.iscollide(completion);
                            this.completion=z1.getcompletion();

                            Collide c7= new Collide(peas,z7);
                            c7.iscollide(completion);

                            Collide c8= new Collide(peas,z8);
                            c8.iscollide(completion);

                            Collide c9= new Collide(peas,z9);
                            c9.iscollide(completion);

                            Collide c10= new Collide(peas,z10);
                            c10.iscollide(completion);


                            Image shooter= new Image("/images/peashooter.gif");
                            ImageView peashooter1=new ImageView(shooter);
                            root.getChildren().add(peashooter1);
                            peashooter1.setLayoutX(6);
                            peashooter1.setLayoutY(89);
                            peashooter1.setFitHeight(46);
                            peashooter1.setFitWidth(55);
                            try {
                                test(root, peashooter1,sunf,wal);
                            } catch (CloneNotSupportedException ex) {
                                ex.printStackTrace();
                            }

                        }






                        else if (e.getSceneX() > 240 + 65 + 65 + 65 + 65 && e.getSceneX() < 240 + 65 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(283 + 65 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        } else if (e.getSceneX() > 240 + 65 + 65 + 65 + 65 + 65 && e.getSceneX() < 240 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        } else if (e.getSceneX() > 232 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneX() < 232 + 65 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 + 65 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        } else if (e.getSceneX() > 232 + 65 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneX() < 232 + 65 + 65 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 + 65 + 65 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        } else if (e.getSceneX() > 232 + 65 + 65 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneX() < 232 + 65 + 65 + 65 + 65 + 65 + 65 + 65 + 65 + 65 && e.getSceneY() > 20 && e.getSceneY() < 20 + 100) {
                            peashooter.setTranslateX(275 + 65 + 65 + 65 + 65 + 65 + 65 + 65 + 65 - startDragX);
                            peashooter.setTranslateY(60 - startDragY);
                            System.out.println(e.getSceneX() + " " + e.getSceneY());
                        }

                            }


            );

    }
    public void pause() throws IOException {
        Stage primarystage = (Stage) pause.getScene().getWindow();
        Gamemenu gm=new Gamemenu();
        gm.open(primarystage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        scoretoken.setText("");



    }
}



