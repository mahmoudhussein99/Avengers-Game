
package project;

import java.io.File;
import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

class MenuPane extends StackPane{
    String s= new File("Intro.mp3").toURI().toString(); 
       MediaPlayer media=new MediaPlayer(new Media(s));
        public static InstantiatingChampions instantiate1 =new InstantiatingChampions();
                public static InstantiatingChampions instantiate2 =new InstantiatingChampions();

    public MediaPlayer getMedia() {
        return media;
    }

    
    public void setMedia() {
        this.media.pause();
    }
    
ImageView intro = new ImageView("file:Game\\Intro.jpg");
ImageView bckground = new ImageView("file:Game\\bckground.jpg");
MenuPane ()
{}
MenuPane(Stage stage,Scene ComputerPlayer,Scene MultiPlayer,Scene howToPlay){
 
       StackPane background=new StackPane();
      
       media.play();
       media.setCycleCount(MediaPlayer.INDEFINITE);
       
       bckground.setFitHeight(800);
       bckground.setFitWidth(1500);
        
       intro.setFitHeight(800);
       intro.setFitWidth(1500);
        
                
       background.getChildren().add(bckground);
        
       BorderPane Menu=new BorderPane();
       VBox center=new VBox();
       
       center.setPadding(new Insets(10,0,10,50));
       center.setSpacing(50);
       StackPane label=new StackPane();
       
       ImageView menulabel = new ImageView("file:Game//texts (1).png");
       menulabel.setFitHeight(100);
       menulabel.setFitWidth(300);
       label.getChildren().add(menulabel);
       Menu.setTop(label);

       ImageView singleplayer = new ImageView("file:Game//singleplayer.png");
       singleplayer.setFitHeight(100);
       singleplayer.setFitWidth(550);
       singleplayer.setOnMousePressed(e -> {
           Champion.setSingle(true);
           stage.setScene(ComputerPlayer);
      // stage.setFullScreen(true);
       stage.setResizable(false);});
       Project.buttonClick(singleplayer);
       
       ImageView multiplayer = new ImageView("file:Game//multiplayer.png");
       multiplayer.setFitHeight(120);
       multiplayer.setFitWidth(500);

       Project.buttonClick(multiplayer);
       
       
       multiplayer.setOnMousePressed(e -> {
                      
           Champion.setSingle(false);
           stage.setScene(MultiPlayer);
       //stage.setFullScreen(true);
       stage.setResizable(false);});
        
       ImageView Help = new ImageView("file:Game//Help.png");
       Help.setFitHeight(100);
       Help.setFitWidth(300);
       Project.buttonClick(Help);
       Help.setOnMousePressed(e -> {stage.setScene(howToPlay);
       //stage.setFullScreen(true);
       stage.setResizable(false);
       });
        
       ImageView Exit = new ImageView("file:Game//Exit (1).png");
       Exit.setFitHeight(80);
       Exit.setFitWidth(210);
       Project.buttonClick(Exit);
       Exit.setOnMousePressed(e -> stage.close());
        
       center.getChildren().addAll(singleplayer,multiplayer,Help,Exit);
      
       center.setAlignment(Pos.CENTER);

        
      Menu.setLeft(center);
      
      background.getChildren().add(intro);
      
        this.getChildren().add(background);
        
        StackPane Intro=new StackPane();
        Intro.getChildren().add(Menu);
        this.getChildren().add(Intro);

        FadeTransition ft=new FadeTransition(new javafx.util.Duration(4000),intro);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.setAutoReverse(false);
        ft.play();
        
        FadeTransition f=new FadeTransition(new javafx.util.Duration(4000),Menu);
        f.setFromValue(0);
        f.setToValue(1);
        f.setAutoReverse(false);
        f.play();
        
}

}
