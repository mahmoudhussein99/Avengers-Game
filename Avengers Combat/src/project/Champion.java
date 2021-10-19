
package project;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class Champion {
    public static boolean Single =false;
    public static Champion c1=null;
    public static Champion c2=null;

    private String name;
    private double health = 100;
    private int score;
    public static int highScore=0;
    private double power; //hit power
    
    private double speed;  
    // movement speed as a percentage that will be multiplied by milliseconds values in animation
    private int hitRange;// wil be used by computer to check the player within range to hit or not
    
    
    private ImageView facingRight;
    private ImageView facingLeft;
    private ImageView hitRight1; 
    private ImageView hitRight2; 
    private ImageView hitRight3;
    private ImageView hitLeft1;
    private ImageView hitLeft2;
    private ImageView hitLeft3;
    private ImageView movingRight;
    private ImageView movingLeft;
    private ImageView gettingHitRight;
    private ImageView gettingHitLeft;
    
    
    private ArrayList<ImageView> animatedSkins=new ArrayList<ImageView>();
    private int posX;
    private int posY = 400;
    
    private String facing;
    private Group grp;
    
    private ImageView avatar;
    public static int height =350;
    public static int width =300;
    private int compTimer;
    private int avatarHeight=50;
    private int avatarWidth=100;
    private boolean jumplock;
    private boolean jumpRightLock;
    private boolean jumpLeftLock;
    private boolean moveRightLock;
    private boolean moveLeftLock;
    private boolean hitLock;
    private boolean getHitLock;
    
    
    public Champion (String name, double power, double speed){
        this.score=0;
        this.hitLock=false;
        this.name=name;
        this.power = power;
        this.speed=speed;
        this.hitRange=50;
        this.jumplock=false;
        jumpLeftLock=false;
        jumpRightLock=false;
        moveLeftLock=false;
        moveRightLock=false;
        hitLock=false;
        getHitLock=false;
        
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }
    
    public boolean getHitlock(){
        return this.hitLock;
    }
    
    public void setHitlock(boolean b){
        this.hitLock=b;
    }
    
    public boolean getGetHitlock(){
        return this.getHitLock;
    }
    
    public static void setSingle(boolean b){
        Single=b;
    }
    public void setGetHitlock(boolean b){
        this.getHitLock=b;
    }
    public boolean getJumplock(){
        return this.jumplock;
    }
 public static boolean getSingle(){
     return Single;
 }

    public void setPower(double power) {
        this.power = power;
    }
 
    public void setJumplock(boolean b){
    this.jumplock=b;
    }
    
    public boolean getJumpRightlock(){
        return this.jumpRightLock;
    }
    public void setJumpRightlock(boolean b){
    this.jumpRightLock=b;
}
    public boolean getJumpLeftlock(){
        return this.jumpLeftLock;
    }
    public void setJumpLeftlock(boolean b){
    this.jumpLeftLock=b;
}
    
    public boolean getmoveRightlock(){
        return this.moveRightLock;
    }
    public void setmoveRightlock(boolean b){
    this.moveRightLock=b;
}
    public boolean getmoveLeftlock(){
        return this.moveLeftLock;
    }
    public void setmoveLeftlock(boolean b){
    this.moveLeftLock=b;
}

    public ImageView getGettingHitLeft() {
        return gettingHitLeft;
    }

    public ImageView getGettingHitRight() {
        return gettingHitRight;
    }

    public ImageView getMovingLeft() {
        return movingLeft;
    }

    public ImageView getMovingRight() {
        return movingRight;
    }
    

    public void setAvatar(ImageView avatar) {
        this.avatar = avatar;
        this.avatar.setFitHeight(avatarHeight);
        this.avatar.setFitWidth(avatarWidth);
    
    }

    public int getAvatarHeight() {
        return avatarHeight;
    }

    public int getAvatarWidth() {
        return avatarWidth;
    }
public static void setChampion1(Champion c){
    c1=c;
}
public static void setChampion2(Champion c){
    c2=c;
}
public static Champion getChampion1(){
    return c1;
}
public static Champion getChampion2(){
    return c2;
}
    public void setAvatarHeight(int avatarHeight) {
        this.avatarHeight = avatarHeight;
    }

    public void setAvatarWidth(int avatarWidth) {
        this.avatarWidth = avatarWidth;
    }
    

    public ImageView getAvatar() {
        return avatar;
    }
    
    
    
    

    public void setHitRange(int hitRange) {
        this.hitRange = hitRange;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getHitRange() {
        return hitRange;
    }
    
    
    void editHealth(int health){
        this.health += health;
    }
    
    public double getHealth(){
        return health;
    }
   
    public double getPower(){
        return power;
    }
      
    public int getX(){
        return this.posX;
    }

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }
    
    public void setX(int x){
        this.posX = x;
    }
    
    public void editX(int x){
        this.posX += x;
    }
    
    public int getY(){
        return this.posY;
    }
    
    public void setY(int y){
        this.posY = y;
    }
    
    public void setSpeed(double speed){
        this.speed=speed;
    }
    
    public double getSpeed(){
        return this.speed;
    }
    
    public void setFacing(String faceloc){
        
            this.facing=faceloc;// check on updating the facing
        
    }
    
    public String getFacing(){
        return this.facing;
    }

    public ArrayList<ImageView> getAnimatedSkins() {
        return animatedSkins;
    }

    public String getName() {
        return name;
    }
    
           
    public void setAnimSkins(ImageView fRight, ImageView fLeft, ImageView hRight1,ImageView hRight2,ImageView hRight3, ImageView hLeft1, ImageView hLeft2, ImageView hLeft3,ImageView movingRight,ImageView movingLeft,ImageView gettingHitRight,ImageView gettingHitLeft){
        
        this.facingRight = fRight; animatedSkins.add(this.facingRight);
        this.facingLeft = fLeft;    animatedSkins.add(this.facingLeft);
        this.hitRight1 = hRight1;     animatedSkins.add(this.hitRight1);
        this.hitRight2 = hRight2;     animatedSkins.add(this.hitRight2);
        this.hitRight3 = hRight3;     animatedSkins.add(this.hitRight3);
        this.hitLeft1 = hLeft1;       animatedSkins.add(this.hitLeft1);
        this.hitLeft2 = hLeft2;       animatedSkins.add(this.hitLeft2);
        this.hitLeft3 = hLeft3;       animatedSkins.add(this.hitLeft3);
        this.gettingHitRight=gettingHitRight;   animatedSkins.add(this.gettingHitRight);
        this.gettingHitLeft=gettingHitLeft;     animatedSkins.add(this.gettingHitLeft);
        this.movingRight=movingRight;           animatedSkins.add(this.movingRight);
        this.movingLeft=movingLeft;             animatedSkins.add(this.movingLeft);
        
        
        int Y=(int)BattlePane.bounds.getMaxY()*7/14;;
        int X1=(int)BattlePane.bounds.getMaxX()*3/10;
        int X2=(int)BattlePane.bounds.getMaxX()*6/10;
        this.facingRight.setFitHeight(height);
        this.facingRight.setFitWidth(width);
        this.facingRight.setY(Y);
        if (this.facing == "Right"){
                this.facingRight.setX(X1);
            }else{
                this.facingRight.setX(X2);
        }
        
        this.facingLeft.setFitHeight(height);
        this.facingLeft.setFitWidth(width);
        this.facingLeft.setY(Y);
        if (this.facing == "Right"){
                this.facingLeft.setX(X1);
            }else{
                this.facingLeft.setX(X2);
        }
        
        
        this.hitRight1.setFitHeight(height);
        this.hitRight1.setFitWidth(width);
        this.hitRight1.setY(Y);
        if (this.facing == "Right"){
                this.hitRight1.setX(X1);
            }else{
                this.hitRight1.setX(X2);
        }
        
        this.hitRight2.setFitHeight(height);
        this.hitRight2.setFitWidth(width);
        this.hitRight2.setY(Y);
        if (this.facing == "Right"){
                this.hitRight2.setX(X1);
            }else{
                this.hitRight2.setX(X2);
        }
        
        this.hitRight3.setFitHeight(height);
        this.hitRight3.setFitWidth(width);
        this.hitRight3.setY(Y);
        if (this.facing == "Right"){
                this.hitRight3.setX(X1);
            }else{
                this.hitRight3.setX(X2);
        }
        
        this.hitLeft1.setFitHeight(height);
        this.hitLeft1.setFitWidth(width);
        this.hitLeft1.setY(Y);
        if (this.facing == "Right"){
                this.hitLeft1.setX(X1);
            }else{
                this.hitLeft1.setX(X2);
        }
        this.hitLeft2.setFitHeight(height);
        this.hitLeft2.setFitWidth(width);
        this.hitLeft2.setY(Y);
        if (this.facing == "Right"){
                this.hitLeft2.setX(X1);
            }else{
                this.hitLeft2.setX(X2);
        }
        this.hitLeft3.setFitHeight(height);
        this.hitLeft3.setFitWidth(width);
        this.hitLeft3.setY(Y);
        if (this.facing == "Right"){
                this.hitLeft3.setX(X1);
            }else{
                this.hitLeft3.setX(X2);
        }
        
        this.gettingHitRight.setFitHeight(1.5*height);
        this.gettingHitRight.setFitWidth(width);
        this.gettingHitRight.setY(Y-height/3);
        
        this.gettingHitLeft.setFitHeight(1.5*height);
        this.gettingHitLeft.setFitWidth(width);
        this.gettingHitLeft.setY(Y-height/3);
        
        this.movingRight.setFitHeight(height);
        this.movingRight.setFitWidth(width);
        this.movingRight.setY(Y);
        
        this.movingLeft.setFitHeight(height);
        this.movingLeft.setFitWidth(width);
        this.movingLeft.setY(Y);
        
    }
    
    public ImageView getFacingRight(){
        return this.facingRight;
    }
    
    public ImageView getFacingLeft(){
        return this.facingLeft;
    }
    
    public ImageView getHittingRight1(){
        return this.hitRight1;
    }
    public ImageView getHittingRight2(){
        return this.hitRight2;
    }
    public ImageView getHittingRight3(){
        return this.hitRight3;
    }
    public ImageView getHittingLeft1(){
        return this.hitLeft1;
    }
    public ImageView getHittingLeft2(){
        return this.hitLeft2;
    }
    public ImageView getHittingLeft3(){
        return this.hitLeft3;
    }
    public boolean checkIfDead(){
        return this.health<=0;
    }
   
    public void setCompDifficulty(level ll){
        
        if(ll == level.easy){
            this.power -= (int)(this.power/2);
            this.compTimer = 5;
        }else if(ll == level.medium){
            this.power -= 3;
            this.compTimer = 3;
        }else{
            this.compTimer = 2;
        }
    }
    
    public void moveAllImgs(int number){
        for (int i =0; i<animatedSkins.size(); i++){
            animatedSkins.get(i).setX(animatedSkins.get(i).getX()+number);
    }
}
}
enum numOfPlayers{
        
        one,two;
}
enum level{
        
        easy, medium, hard;
}

    
