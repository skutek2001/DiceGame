package javaapplication1.Player;

import javaapplication1.Player.Player;
import java.util.Random;

public class PlayerComp extends Player{
    private final Random rand = new Random();
    
    public PlayerComp(){}
    
    public PlayerComp(String name){
        super(name);
    }
    
    public int guess(){
        return rand.nextInt(6)+1;
    }
}
