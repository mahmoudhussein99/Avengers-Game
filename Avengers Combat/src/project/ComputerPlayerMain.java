
package project;

import java.util.concurrent.TimeUnit;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;



class ComputerPlayerMain   {   
    
    private level Level;
    private Champion c2;
    private boolean hitNow = false;
    
    
    public ComputerPlayerMain(level Level, Champion championSelected) {
        this.Level = Level;
        this.c2 = championSelected;
        
        if (this.Level==level.easy) {this.c2.setPower(2.5); this.c2.setSpeed(300.0);}
        if (this.Level==(level.medium)) {this.c2.setPower(5.0);this.c2.setSpeed(200.0);}
        if (this.Level==(level.hard)){ this.c2.setPower(10.0);this.c2.setSpeed(150.0);}
    }
    
    
    
}



