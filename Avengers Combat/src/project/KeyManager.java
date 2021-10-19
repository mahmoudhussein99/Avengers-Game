

package project;

import java.util.*;
import javafx.scene.input.KeyEvent;


public class KeyManager {
    private static boolean play=false;
    private boolean keyStates [];
    
    public KeyManager(){
        keyStates= new boolean[8] ;
        for(int i=0;i<8;i++) keyStates[i]=false;
    }
    public int getIndexOfKey(KeyEvent key ){
        switch (key.getCode()){
            case UP: return 0;
            case RIGHT: return 1;
            case LEFT: return 2;
            case DOWN: return 3;
            
        }
        switch (key.getText().charAt(0)){
            case 'w': 
            case 'W': return 4;
            case 'D':
            case 'd': return 5;
            case 'a':
            case 'A': return 6;
            case 's':
            case 'S': return 7;
            default: 
                return -1;
        }
    }
    /**
     * function to get the key state of a specific key
     * @param n 0 -> UP  
     * 1 -> RIGHT
     * 2 -> LEFT
     * 3 -> DOWN
     * 4 -> W
     * 5 -> D
     * 6 -> A
     * 7 -> S
     * @return 
     */
    public boolean getKeyState(int n){
         return keyStates[n];
    }
    
    /**
     * function to either set the key to true on pressed or false on released
     * @param b 
     */
    public void setKeyState( boolean b, KeyEvent key){
        if (getIndexOfKey(key)!= -1)keyStates[getIndexOfKey(key)]=b;
    }
public static boolean getPlay(){
    return play;
}
public static void setPlay(boolean b){
     play=b;
}

}
