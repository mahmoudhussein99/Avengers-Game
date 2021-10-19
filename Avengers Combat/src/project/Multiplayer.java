
package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class Multiplayer extends StackPane {
    ImageView back = new ImageView("file:Game//main.gif");

       private Button createButton1 = new Button("Next");
      

    public Button getCreateButton1() {
        return createButton1;
    }
       
       
    public Multiplayer(Stage stage){
           
            back.setFitHeight(BattlePane.bounds.getMaxY());
            back.setFitWidth(BattlePane.bounds.getMaxX());
            StackPane background=new StackPane();
            background.getChildren().add(back);
            
        this.getChildren().add(background);
        
        StackPane label1=new StackPane();
        label1.setMinSize(100, 300);
        StackPane label2=new StackPane();
        label2.setMinSize(100,300);
        
        ImageView l1=new ImageView("file:Game//champion 1.png");
        l1.setFitHeight(100);
        l1.setFitWidth(300);
        ImageView l2=new ImageView("file:Game//champion 2.png");
        l2.setFitHeight(100);
        l2.setFitWidth(300);
        label1.getChildren().add(l1);
        label2.getChildren().add(l2);
        label1.setPadding(new Insets(150,0,0,60));
        label2.setPadding(new Insets(0,60,140,0));
        label1.setAlignment(Pos.TOP_LEFT);
        label2.setAlignment(Pos.BOTTOM_RIGHT);
        this.getChildren().add(label2);
        this.getChildren().add(label1);
        
        BorderPane total=new BorderPane();
        total.setPadding(new Insets(100,50,100,50));
        GridPane buttons=new GridPane();

        buttons.setHgap(20);
        buttons.setVgap(20);
        
        ToggleGroup group=new ToggleGroup();
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
      
        ImageView [] champs = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12};
        for (int i = 0 ; i < 12 ; i++)
            {
                champs[i].setFitHeight(120);
                champs[i].setFitWidth(120);
               
            }
        int num=0;
        int playerSelected = 0;
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<6;c++){
            
            ToggleButton b=new ToggleButton("");
            b.setGraphic(champs[num++]);
            Project.buttonClick(b);
            b.setPrefSize(90, 90);
            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(new DropShadow());
                    b.setPrefSize(92,92);
                }
            });
            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(null);
                    b.setPrefSize(90,90);
                }
                
            });
            
            b.setToggleGroup(group);
            chooseChampion11 chooseRequiresAction = new chooseChampion11(r*6+c, stage);
            b.setOnAction(chooseRequiresAction);
            buttons.add(b,c,r);
            }
        }
        
        ImageView img13 = new ImageView("file:project logos//black panther logo.png");
        ImageView img14 = new ImageView("file:project logos//black widow logo.png");
        ImageView img15 = new ImageView("file:project logos//capmarvel logo.png");
        ImageView img16 = new ImageView("file:project logos//captain logo.png");
        ImageView img17 = new ImageView("file:project logos//dr strange logo.png");
        ImageView img18 = new ImageView("file:project logos//hawkeye logo.png");
        ImageView img19 = new ImageView("file:project logos//hulk logo.png");
        ImageView img20 = new ImageView("file:project logos//iron man logo.png");
        ImageView img21 = new ImageView("file:project logos//nebula logo.png");
        ImageView img22 = new ImageView("file:project logos//spiderman logo.png");
        ImageView img23 = new ImageView("file:project logos//thor logo.png");
        ImageView img24 = new ImageView("file:project logos//winterso logo.png");
      
        ImageView [] champ = {img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24};
        for (int i = 0 ; i < 12 ; i++)
            {
                champ[i].setFitHeight(120);
                champ[i].setFitWidth(120);
               
            }
        GridPane buttons1= new GridPane();
        buttons1.setHgap(20);
        buttons1.setVgap(20);
        buttons.setPadding(new Insets(0,0,20,0));
        buttons1.setPadding(new Insets(20,0,0,0));
        ToggleGroup group2=new ToggleGroup();
        int n=0;
         for(int r=0;r<2;r++)
        {
            for(int c=0;c<6;c++){
            
            ToggleButton b=new ToggleButton("");
            b.setGraphic(champ[n++]);
            b.setPrefSize(90, 90);
            Project.buttonClick(b);
            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(new DropShadow());
                    b.setPrefSize(92,92);
                }
            });
            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    b.setEffect(null);
                    b.setPrefSize(90,90);
                }
            });
            chooseChampion21 chooseRequiresAction = new chooseChampion21(r*6+c, stage);//, map);
            b.setOnAction(chooseRequiresAction);
            buttons1.add(b,c,r);
            b.setToggleGroup(group2);
            }
        }
       
        buttons.setAlignment(Pos.TOP_RIGHT);
        buttons1.setAlignment(Pos.BOTTOM_LEFT);
        total.setTop(buttons);
        total.setBottom(buttons1);

        
        
        this.getChildren().add(total);
            this.setStyle("-fx-background-color: black");

        
        
       }
}
class chooseChampion11 implements EventHandler<ActionEvent>{
        private int  index;
        private Stage stage;
        
        public chooseChampion11(int n, Stage stage ){
            index=n ;
            this.stage=stage;
        }
        
        @Override
        public void handle(ActionEvent e){
            Champion.setChampion1(MenuPane.instantiate1.getChampion(index));
            if(Champion.c1!=null && Champion.c2!=null){stage.setScene(new Scene(new maps(stage)));
  //          stage.setFullScreen(true);
            stage.setResizable(false);
        }
        }
    }
class chooseChampion21 implements EventHandler<ActionEvent>{
        private int  index;
        private Stage stage;
        
        public chooseChampion21(int n,Stage stage ){ 
            index=n ;
            this.stage=stage;
        }
        
        @Override
        public void handle(ActionEvent e){
            Champion.setChampion2(MenuPane.instantiate2.getChampion(index));
            if(Champion.c1!=null && Champion.c2!=null) {stage.setScene(new Scene(new maps(stage)));
//            stage.setFullScreen(true);
            stage.setResizable(false);
            }
            

        }

    }

