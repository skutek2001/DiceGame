package javaapplication1.Player;

import javaapplication1.Player.Player;
import java.util.Scanner;

public class PlayerHuman extends Player{
    
    public PlayerHuman(){}
    
    public PlayerHuman(String name){
        super(name);
    }
    
    private final Scanner scanner = new Scanner(System.in);
    
    public int guess(){
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }    
}
