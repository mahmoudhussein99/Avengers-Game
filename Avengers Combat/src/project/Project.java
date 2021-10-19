
package project;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Project extends Application {
    
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
         
       ComputerPlayer comp=new ComputerPlayer(primaryStage);
       Scene ComputerPlayer=new Scene(comp);
       
       Multiplayer multi =new Multiplayer(primaryStage);
       Scene MultiPlayer=new Scene(multi);
       
       Help help=new Help();
       Scene HowToPlay=new Scene(help);
     
       
       MenuPane m=new MenuPane(primaryStage,ComputerPlayer,MultiPlayer,HowToPlay);
       
       Scene Menu=new Scene(m);
       
       help.getImageView().setOnMouseClicked(e -> {primaryStage.setScene(Menu);
                //primaryStage.setFullScreen(true);
                primaryStage.setResizable(false);
       });
       
        BattlePane.backToMenu.setOnMouseClicked(e->{
            primaryStage.setScene(Menu);
            
            Champion.setChampion1(null);
            Champion.setChampion2(null);
            BattlePane.game.stop();
            BattlePane.comp.stop();
         //   primaryStage.setFullScreen(true);
       primaryStage.setResizable(false);
        });
        buttonClick(BattlePane.backToMenu);
       primaryStage.setScene(Menu);
       //primaryStage.setFullScreen(true);
       primaryStage.setResizable(false);
       primaryStage.show();
    }
    
    
   public static void buttonClick(Node n)
   {
       n.setOnMouseEntered(e -> {
        
           String s= new File("buttonclick.mp3").toURI().toString();
           MediaPlayer media=new MediaPlayer(new Media(s));
           media.play();
           if (n instanceof ImageView){
               ImageView currentImg= (ImageView)n;
               currentImg.setFitHeight(currentImg.getFitHeight()+50);
               currentImg.setFitWidth(currentImg.getFitWidth()+100);

           }
       });
       n.setOnMouseExited(e->{
       
       if (n instanceof ImageView){
               ImageView currentImg= (ImageView)n;
               currentImg.setFitHeight(currentImg.getFitHeight()-50);
               currentImg.setFitWidth(currentImg.getFitWidth()-100);
           }
       });
   }
}