package project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


class Help extends StackPane{
    ImageView back = new ImageView("file:Game//Back.png");
      
      

    public ImageView getImageView() {
        return back;
    }
    Help(){

    ImageView background = new ImageView("file:Game//HelpBackGround.png");
    background.setFitHeight(BattlePane.bounds.getHeight());
    background.setFitWidth(BattlePane.bounds.getWidth());
   StackPane pane = new StackPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(0,0,0,0));
        pane.getChildren().add(back);
        back.setFitHeight(50);
        back.setFitWidth(150);
        
        Project.buttonClick(back);
    this.setStyle("-fx-background-color: black");
    this.getChildren().addAll(background,pane);
    }
    
}