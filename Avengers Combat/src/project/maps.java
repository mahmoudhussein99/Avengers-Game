
package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class maps extends StackPane{
    ImageView bckGround = new ImageView("file:Game\\mainmap.jpg");
    
    maps(Stage stage){
    
       MenuPane m= new MenuPane();
       m.getMedia().pause();
        bckGround.setFitHeight(700);
        bckGround.setFitWidth(1500);
        StackPane background = new StackPane();
        background.getChildren().add(bckGround);
        
        background.setStyle("-fx-background-color: black");
        this.getChildren().add(background);
        BorderPane Maps = new BorderPane();
        StackPane stack = new StackPane();
        ImageView lb1= new ImageView("file:Game//maps.png");
        lb1.setFitWidth(300);
        lb1.setFitHeight(100);
        stack.setPadding(new Insets(100,0,0,0));
        
	stack.getChildren().add(lb1);
        Maps.setTop(stack);
        
        GridPane h = new GridPane();
        h.setPadding(new Insets(170,400,200,400));
        h.setHgap(150);
       
        ImageView map1 = new ImageView("file:Game\\map 1.jpg");
        map1.setFitHeight(300); 
        map1.setFitWidth(300);
        
        ToggleGroup group2 =new ToggleGroup();
        

        
        
        
        ToggleButton b1 =new ToggleButton("");
        b1.setPrefSize(300, 300);
        Project.buttonClick(b1);
        b1.setGraphic(map1);
        b1.setToggleGroup(group2);
        GoToBattle goToMap1= new GoToBattle(map1, stage);
        b1.setOnAction(goToMap1);



        ImageView map2 = new ImageView("file:Game\\map 2.jpg");

        map2.setFitHeight(300); 
        map2.setFitWidth(300);
        ToggleButton b2 =new ToggleButton("");
        Project.buttonClick(b2);
        b2.setPrefSize(300, 300);
        b2.setGraphic(map2);
        b2.setToggleGroup(group2);
        GoToBattle goToMap2= new GoToBattle(map2, stage);
        b2.setOnAction(goToMap2);
        b2.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler <MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b2.setPrefSize(350, 350);
            }
        });
        b2.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler <MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b2.setPrefSize(300, 300);
            }
        });
        h.add(b1,0,0);
        h.add(b2, 1, 0);
        Maps.setCenter(h);
       

        this.getChildren().add(Maps);
        }
    
}
   
class GoToBattle implements EventHandler<ActionEvent>{
        private ImageView  map;
        private Stage stage;
        private Scene menu;
        
        public GoToBattle(ImageView img,Stage stage){
            map=img;
            this.stage=stage;
            this.menu=menu;
            
            
        }
        
        @Override
        public void handle(ActionEvent e){
         BattlePane battle =new BattlePane(map, Champion.c1, Champion.c2);
            Scene s= new Scene(battle);
            stage.setScene(s);
            battle.requestFocus();
    //        stage.setFullScreen(true);
            stage.setResizable(false);

        }

    }




