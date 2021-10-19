

package project;

import java.util.HashSet;
import java.util.Set;
import javafx.animation.KeyFrame;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.util.Duration;

public class BattlePane extends StackPane{
    private ImageView bckground ;
    static String folderPath= "file:images\\";
    static ImageView gameOverImg = new ImageView(folderPath+"game over.png");
   
    private Champion c1;
    private Champion c2;
    private ComputerPlayerMain computer;
    private Pane imagesPaneC1= new Pane();
    private Pane imagesPaneC2= new Pane();    
    public static Screen screen = Screen.getPrimary();
    public static Rectangle2D bounds = screen.getVisualBounds();
    private KeyManager myKeys;
    private HealthBar healthBar1;
    private HealthBar healthBar2;
    public static Timeline game;
    public static Timeline comp;
    public static ImageView backToMenu=new ImageView("file:Game\\Back.png");
    private static boolean gameEnd;
    private boolean [] wasRunning= new boolean[4];
    
    
    
    public BattlePane(ImageView bckground, Champion champion1, Champion champion2){
        
        
        this.bckground=bckground;
        this.c1=champion1;
        this.c1.setFacing("Right");
        gameEnd=false;
        this.c2=champion2;
        this.c2.setFacing("Left");
        if (c2.getName().equals("Loki")){
        this.computer = new ComputerPlayerMain(level.easy, c2);
}
        else if (c2.getName().equals("Ultron")){
        this.computer = new ComputerPlayerMain(level.medium, c2);
}
        else if (c2.getName().equals("Thanos")){
        this.computer = new ComputerPlayerMain(level.hard, c2);
}
        
        for(int i=0;i<4;i++) wasRunning[i]=false;
        
         comp = new Timeline(new KeyFrame(Duration.millis(c2.getSpeed()), e->{
            
            if (withinHitRange()&&(!c2.getGetHitlock())&&(!c2.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneC2, c2, c1, healthBar1.getLifeRectangle(), this, imagesPaneC1);
            if (onHisRight()&&(!c2.getGetHitlock()))ChampionAnimation.moveRight(imagesPaneC2, c2);
            if (onHisLeft()&&(!c2.getGetHitlock()))ChampionAnimation.moveLeft(imagesPaneC2, c2);
        }));
        startBattle();
        
         myKeys= new KeyManager();
        this.setOnKeyPressed(e->{
            KeyManager.setPlay(true);
           myKeys.setKeyState(true, e);
        });
        this.setOnKeyReleased(e->{
           myKeys.setKeyState(false, e);
        });
        
         game = new Timeline(new KeyFrame(Duration.millis(100), e->{
        if(!gameEnd){if (Champion.getSingle())updateSingleBattle();
        else updateMultiBattle();
        }
        }));
        game.setCycleCount(Timeline.INDEFINITE);
        game.play();
 
    }

    public static void setGameEnd(boolean g) {
        gameEnd = g;
    }
    
    public static boolean getGameEnd(){
        return gameEnd;
    }
    public void startBattle(){
        
        c1.setHealth(100.0);
        c2.setHealth(100.0);
        c1.getFacingRight().setX(200);
        c2.getFacingLeft().setX(800);
        
        gameEnd=false;
        bckground.setX(0);
        bckground.setY(0);
        bckground.setFitHeight(bounds.getMaxX());
        bckground.setFitWidth(bounds.getMaxX());
        
         healthBar1= new HealthBar(c1);
         healthBar2= new HealthBar(c2);
        
        healthBar1.getLogo().setX(bounds.getMaxX()/10);
        healthBar1.getBase().setX(bounds.getMaxX()/10);
        healthBar1.getLogo().setY(bounds.getMaxY()/50);
        healthBar1.getBase().setY((bounds.getMaxY()/50)+c1.getAvatarHeight());
        
        healthBar2.getLogo().setX(bounds.getMaxX()*6/10);
        healthBar2.getBase().setX(bounds.getMaxX()*6/10);
        healthBar2.getLogo().setY(bounds.getMaxY()/50);
        healthBar2.getBase().setY((bounds.getMaxY()/50)+c2.getAvatarHeight());
        
        
        imagesPaneC1.getChildren().add(c1.getFacingRight());
        imagesPaneC2.getChildren().add(c2.getFacingLeft());
        
        this.getChildren().addAll(bckground,imagesPaneC1,imagesPaneC2,healthBar1,healthBar2);
    }
    public void updateMultiBattle(){
        
        try{
        if(KeyManager.getPlay()){if (myKeys.getKeyState(0)&&(!c1.getJumplock())&&(!c1.getGetHitlock())) ChampionAnimation.jump(c1);
        else if(myKeys.getKeyState(1)&&(!c1.getGetHitlock())){ ChampionAnimation.moveRight(imagesPaneC1, c1); wasRunning[0]=true;}
        else if(myKeys.getKeyState(2)&&(!c1.getGetHitlock())) {ChampionAnimation.moveLeft(imagesPaneC1, c1);wasRunning[1]=true;}
        else if(myKeys.getKeyState(3)&&(!c1.getGetHitlock())&&(!c1.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneC1, c1,c2,healthBar2.getLifeRectangle(),this,imagesPaneC2);

        if (myKeys.getKeyState(4)&&(!c2.getJumplock())&&(!c2.getGetHitlock())) ChampionAnimation.jump(c2);
        else if(myKeys.getKeyState(5)&&(!c2.getGetHitlock())) {ChampionAnimation.moveRight(imagesPaneC2, c2);wasRunning[2]=true;}
        else if(myKeys.getKeyState(6)&&(!c2.getGetHitlock())){ ChampionAnimation.moveLeft(imagesPaneC2, c2);wasRunning[3]=true;}
        else if(myKeys.getKeyState(7)&&(!c2.getGetHitlock())&&(!c2.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneC2, c2,c1,healthBar1.getLifeRectangle(),this,imagesPaneC1);

        if((!myKeys.getKeyState(1))&&wasRunning[0]){
            imagesPaneC1.getChildren().clear();
            imagesPaneC1.getChildren().add(c1.getFacingRight());
            wasRunning[0]=false;
        }
        if((!myKeys.getKeyState(2))&&wasRunning[1]){
            imagesPaneC1.getChildren().clear();
            imagesPaneC1.getChildren().add(c1.getFacingLeft());
            wasRunning[1]=false;
        }
        if((!myKeys.getKeyState(5))&&wasRunning[2]){
            imagesPaneC2.getChildren().clear();
            imagesPaneC2.getChildren().add(c2.getFacingRight());
            wasRunning[2]=false;
        }
        if((!myKeys.getKeyState(6))&&wasRunning[3]){
            imagesPaneC2.getChildren().clear();
            imagesPaneC2.getChildren().add(c2.getFacingLeft());
            wasRunning[3]=false;
        }
        if( c1.checkIfDead()) gameOverAnim(c2, this);
        else if( c2.checkIfDead()) gameOverAnim(c1, this);}
        }catch(Exception e){};
    }
    public void updateSingleBattle(){
        try{
        if(KeyManager.getPlay()){if (myKeys.getKeyState(0)&&(!c1.getJumplock())&&(!c1.getGetHitlock())) ChampionAnimation.jump(c1);
        else if(myKeys.getKeyState(1)&&(!c1.getGetHitlock())){ ChampionAnimation.moveRight(imagesPaneC1, c1); wasRunning[0]=true;}
        else if(myKeys.getKeyState(2)&&(!c1.getGetHitlock())) {ChampionAnimation.moveLeft(imagesPaneC1, c1);wasRunning[1]=true;}
        else if(myKeys.getKeyState(3)&&(!c1.getGetHitlock())&&(!c1.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneC1, c1,c2,healthBar2.getLifeRectangle(),this,imagesPaneC2);
        
        if((!myKeys.getKeyState(1))&&wasRunning[0]){
            imagesPaneC1.getChildren().clear();
            imagesPaneC1.getChildren().add(c1.getFacingRight());
            wasRunning[0]=false;
        }
        if((!myKeys.getKeyState(2))&&wasRunning[1]){
            imagesPaneC1.getChildren().clear();
            imagesPaneC1.getChildren().add(c1.getFacingLeft());
            wasRunning[1]=false;
        }}
        
        
        comp.play();
        if( c1.checkIfDead()) gameOverAnim(c2, this);
        else if( c2.checkIfDead()) gameOverAnim(c1, this);
        } catch(Exception e){
        
        }
        
    }
    public boolean withinHitRange(){
        int hitRange= c2.getHitRange()+c2.getAvatarWidth();// N is the dminesion pof the player
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Right")){
            
            if (Math.abs(c1.getFacingRight().getX()-c2.getFacingRight().getX())<hitRange){// check within hit range

                return true;
            }
    }
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Left")){
            if (Math.abs(c1.getFacingLeft().getX()-c2.getFacingRight().getX())<hitRange){// check within hit range
      
                return true;
            }
    }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Right")){
            if (Math.abs(c1.getFacingRight().getX()-c2.getFacingLeft().getX())<hitRange){// check within hit range
          
               return true;
            }
    }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Left")){
            if (Math.abs(c1.getFacingLeft().getX()-c2.getFacingLeft().getX())<hitRange)// check within hit range
          
                return true;
            
    }
        return false;
    }    
    public boolean onHisRight(){
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Right")){
            if (c2.getFacingRight().getX()<c1.getFacingRight().getX())
                return true;
        }
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Left")){
            if (c2.getFacingRight().getX()<c1.getFacingLeft().getX())
                return true;
        }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Right")){
            if (c2.getFacingLeft().getX()<c1.getFacingRight().getX())
                return true;
        }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Left")){
            if (c2.getFacingLeft().getX()<c1.getFacingLeft().getX())
                return true;
        }
        return false;
    }
    
    public boolean onHisLeft(){
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Right")){
            if (c2.getFacingRight().getX()>c1.getFacingRight().getX())
                return true;
        }
        if (c2.getFacing().equals("Right")&&c1.getFacing().equals("Left")){
            if (c2.getFacingRight().getX()>c1.getFacingLeft().getX())
                return true;
        }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Right")){
            if (c2.getFacingLeft().getX()>c1.getFacingRight().getX())
                return true;
        }
        if (c2.getFacing().equals("Left")&&c1.getFacing().equals("Left")){
            if (c2.getFacingLeft().getX()>c1.getFacingLeft().getX())
                return true;
        }
        return false;
    }

    public BattlePane(ImageView bck) {
    this(bck, Champion.c1, Champion.c2);
    }

    public Champion getC1() {
        return c1;
    }

    public Champion getC2() {
        return c2;
    }

    public ImageView getBckground() {
        return bckground;
    }

    public void setBckground(ImageView bckground) {
        this.bckground = bckground;
    }

    public void setC1(Champion c1) {
        this.c1 = c1;
    }

    public void setC2(Champion c2) {
        this.c2 = c2;
        this.c1.setFacing("Right");
        
        this.c2.setFacing("Left");
        this.computer = new ComputerPlayerMain(level.easy, c2);

        
        for(int i=0;i<4;i++) wasRunning[i]=false;
        
        
         comp = new Timeline(new KeyFrame(Duration.millis(c2.getSpeed()), e->{
            
            if (withinHitRange()&&(!c2.getGetHitlock())&&(!c2.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneC2, c2, c1, healthBar1.getLifeRectangle(), this, imagesPaneC1);
            if (onHisRight()&&(!c2.getGetHitlock()))ChampionAnimation.moveRight(imagesPaneC2, c2);
            if (onHisLeft()&&(!c2.getGetHitlock()))ChampionAnimation.moveLeft(imagesPaneC2, c2);
        }));
        startBattle();
        
         myKeys= new KeyManager();
        this.setOnKeyPressed(e->{
           myKeys.setKeyState(true, e);
        });
        this.setOnKeyReleased(e->{
           myKeys.setKeyState(false, e);
        });
        
         game = new Timeline(new KeyFrame(Duration.millis(100), e->{
        if(!gameEnd){if (Champion.getSingle())updateSingleBattle();
        else updateMultiBattle();
        }
        }));
        game.setCycleCount(Timeline.INDEFINITE);
        game.play();
 
    }

    public BattlePane() {
    }
    
    
    public static void gameOverAnim(Champion c,BattlePane grp){
        
        BattlePane.setGameEnd(true);
        gameOverImg.setFitHeight(300);
        gameOverImg.setFitWidth(300);
        gameOverImg.setLayoutX(0);
        gameOverImg.setLayoutY(0);
        c.setScore((int)c.getHealth()*200);
        if(c.getScore()>Champion.highScore)Champion.highScore=c.getScore();
        
        grp.getChildren().add(gameOverImg);
       Text scorelbl= new Text(c.getName()+" wins!! \n"+"Score: "+c.getScore()+"\nHighest Score: "+Champion.highScore);

       scorelbl.setFont(Font.font(70));
       scorelbl.setFill(Color.GOLD);
       scorelbl.setX(gameOverImg.getX()+gameOverImg.getFitWidth()/2);
       scorelbl.setY(200);
       
       
       backToMenu.setFitHeight(100);
       backToMenu.setFitWidth(300);
       StackPane backPane =new StackPane(backToMenu);
       backPane.setAlignment(Pos.BOTTOM_LEFT);
       
       
        ScaleTransition gameOver = new ScaleTransition(Duration.millis(500), gameOverImg);
        gameOver.setByX(1.5);
        gameOver.setByY(1.5);
        gameOver.setCycleCount(10);
        gameOver.setAutoReverse(true);
        
        SequentialTransition sq1 = new SequentialTransition(gameOverImg, gameOver);
        sq1.play();
        sq1.setOnFinished(e->{
        grp.getChildren().addAll(scorelbl,backPane);
        grp.getChildren().remove(gameOverImg);
        });
        
        
    }  
    
}
