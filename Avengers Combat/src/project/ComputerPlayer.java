
package project;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

class ComputerPlayer extends StackPane{
 
 ImageView bckGround = new ImageView("file:Game\\main.gif");
   
 
 
    
    ComputerPlayer(Stage stage){
        StackPane background=new StackPane();
        
            bckGround.setFitHeight(BattlePane.bounds.getMaxY());
            bckGround.setFitWidth(BattlePane.bounds.getMaxX());
        StackPane label1=new StackPane();
        StackPane label2=new StackPane();
        
        ImageView l1=new ImageView("file:Game//champion.png");
        l1.setFitHeight(100);
        l1.setFitWidth(250);
        
        ImageView l2=new ImageView("file:Game//enemy.png");
        l2.setFitHeight(70);
        l2.setFitWidth(200);
        label1.getChildren().add(l1);
        label2.getChildren().add(l2);
        label1.setPadding(new Insets(200,0,0,70));
        label2.setPadding(new Insets(0,0,120,110));
        label1.setAlignment(Pos.TOP_LEFT);
        label2.setAlignment(Pos.BOTTOM_LEFT);

        background.getChildren().add(bckGround);
        BorderPane total=new BorderPane();
        total.setPadding(new Insets(100,50,100,110));
        GridPane buttons=new GridPane();
        buttons.setHgap(20);
        buttons.setVgap(20);
        ToggleGroup group=new ToggleGroup();
        ToggleGroup group2=new ToggleGroup();
        
        GridPane buttons1= new GridPane();
        buttons1.setHgap(20);
        buttons1.setVgap(20);
        
        ImageView img1 = new ImageView("file:project logos//black panther logo.png");
        ImageView img2 = new ImageView("file:project logos//black widow logo.png");
        ImageView img3 = new ImageView("file:project logos//capmarvel logo.png");
        ImageView img4 = new ImageView("file:project logos//captain logo.png");
        ImageView img5 = new ImageView("file:project logos//dr strange logo.png");
        ImageView img6 = new ImageView("file:project logos//hawkeye logo.png");
        ImageView img7 = new ImageView("file:project logos//hulk logo.png");
        ImageView img8 = new ImageView("file:project logos//iron man logo.png");
        ImageView img9 = new ImageView("file:project logos//nebula logo.png");
        ImageView img10 = new ImageView("file:project logos//spiderman logo.png");
        ImageView img11 = new ImageView("file:project logos//thor logo.png");
        ImageView img12 = new ImageView("file:project logos//winterso logo.png");
        ImageView img13 = new ImageView("file:project logos//loki logo.png");
        ImageView img14 = new ImageView("file:project logos//ultron logo.png");
        ImageView img15 = new ImageView("file:project logos//thanos logo.png");
        ImageView [] champs = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15};
        for (int i = 0 ; i < 15 ; i++)
            {
                champs[i].setFitHeight(120);
                champs[i].setFitWidth(120);
               
            }
       int num = 0;
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<6;c++){
            
            ToggleButton b=new ToggleButton("");
            b.setGraphic(champs[num]);
            num++;
            b.setPrefSize(120, 120);
            Project.buttonClick(b);
            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(new DropShadow());
                    b.setPrefSize(122,122);
                }
            });
            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(null);
                    b.setPrefSize(120,120);
                }
                
            });
                chooseChampion1 chooseRequiresAction1 = new chooseChampion1(r*6+c,stage);//,maps);
            b.setToggleGroup(group);
            b.setOnAction(chooseRequiresAction1);
            buttons.add(b,c,r);
            }
        }
       
        buttons1.setHgap(20);
        buttons1.setVgap(20);
         for(int r=0;r<1;r++)
        {
            for(int c=0;c<3;c++){
            
            ToggleButton b=new ToggleButton("");
            b.setGraphic(champs[num++]);
            b.setPrefSize(120, 120);
            Project.buttonClick(b);
            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(new DropShadow());
                    b.setPrefSize(122,122);
                }
            });
            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(null);
                    b.setPrefSize(120,120);
                }
                
            });
            buttons1.add(b,c,r);
            switch (c){
                case 0:Text t11 = new Text("Easy"); t11.setFill(Color.GOLD);StackPane t1= new StackPane(t11);t1.setAlignment(Pos.CENTER);buttons1.add(t1,c,r+1); break;
                case 1: Text t22 = new Text("Medium");t22.setFill(Color.GOLD);StackPane t2= new StackPane(t22);t2.setAlignment(Pos.CENTER);buttons1.add(t2,c,r+1);break;
                case 2: Text t33 = new Text("Hard");t33.setFill(Color.GOLD);StackPane t3= new StackPane(t33);t3.setAlignment(Pos.CENTER);buttons1.add(t3,c,r+1);break;
            }
            b.setToggleGroup(group2);
            chooseChampion2 chooseRequiresAction2 = new chooseChampion2(12+c,stage);
            b.setOnAction(chooseRequiresAction2);// here we should select champions to be passed to maaps
            }
        }

        background.getChildren().add(label2);
        background.getChildren().add(label1);
        buttons.setAlignment(Pos.TOP_CENTER);
        buttons1.setAlignment(Pos.CENTER);
        total.setTop(buttons);
        total.setBottom(buttons1);
        
        
        background.getChildren().add(total);
        this.getChildren().add(background);
           this.setStyle("-fx-background-color: black");
 
    }
}
 class chooseChampion1 implements EventHandler<ActionEvent>{
        private int  index;
        private Stage stage;
        
        public chooseChampion1(int n,Stage stage){
            index=n ;
            this.stage=stage;
        }
        
        @Override
        public void handle(ActionEvent e){
            Champion.setChampion1(MenuPane.instantiate1.getChampion(index));
            if (Champion.c1!= null&& Champion.c2!= null){stage.setScene(new Scene(new maps(stage)));
  //          stage.setFullScreen(true);
            stage.setResizable(false);
        }}

    }
class chooseChampion2 implements EventHandler<ActionEvent>{
        private int  index;
        private Stage stage;
        
        public chooseChampion2(int n,Stage stage){
            index=n ;
            this.stage=stage;
            
        }
        
        @Override
        public void handle(ActionEvent e){
            Champion.setChampion2(MenuPane.instantiate1.getChampion(index));
            if (Champion.c1!= null&& Champion.c2!= null){stage.setScene(new Scene(new maps(stage),BattlePane.bounds.getWidth(),BattlePane.bounds.getHeight()));
//        stage.setFullScreen(true);
        stage.setResizable(false);
        }}

    }