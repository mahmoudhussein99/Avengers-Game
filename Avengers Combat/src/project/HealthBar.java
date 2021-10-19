
package project;

import java.util.HashSet;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class HealthBar extends Pane {
    private ImageView logo;
    private Rectangle base;
    private Rectangle lifeRectangle;
    
    public HealthBar(Champion c){
        logo=c.getAvatar();
        logoCenterCrop(c);
        base= new Rectangle();
        lifeRectangle= new Rectangle();
        DoubleProperty maxLife = new SimpleDoubleProperty(100);
        base.widthProperty().bind(maxLife.multiply(4));
        base.setHeight(20);
        base.setArcHeight(10);
        base.setArcWidth(20);
        base.setFill(Color.BLACK);
        
        
        lifeRectangle.setWidth(400);
        lifeRectangle.setHeight(20);
        lifeRectangle.setArcHeight(10);
        lifeRectangle.setArcWidth(20);
        lifeRectangle.setFill(Color.GREEN);
        lifeRectangle.xProperty().bind(base.xProperty());
        lifeRectangle.yProperty().bind(base.yProperty());
        
        this.getChildren().addAll(logo,base,lifeRectangle);
        
    }
    public static void logoCenterCrop(Champion c){
        ImageView userImage = c.getAvatar();
        double newMeasure = (userImage.getImage().getWidth() < userImage.getImage().getHeight()) ? userImage.getImage().getWidth() : userImage.getImage().getHeight();
        double x = (userImage.getImage().getWidth() - newMeasure) / 2;
        double y = (userImage.getImage().getHeight() - newMeasure) / 2;

        Rectangle2D rect = new Rectangle2D  (x, y, newMeasure, newMeasure);
        userImage.setViewport(rect);
        userImage.setFitWidth(c.getAvatarWidth());
        userImage.setFitHeight(c.getAvatarHeight());
        userImage.setSmooth(true);
    }    

    public ImageView getLogo() {
        return logo;
    }

    public Rectangle getBase() {
        return base;
    }

    public Rectangle getLifeRectangle() {
        return lifeRectangle;
    }
    
    
}
