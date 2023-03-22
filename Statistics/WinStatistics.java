package javaapplication1.Statistics;

import javaapplication1.Player.Player;
import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics{
    
    private Map<Player, Integer> listawynikow = new HashMap<>();
    
    public void print(){
        System.out.println("==========PUNKTACJA==========");
        listawynikow.forEach((player,wynik) -> {
            System.out.println(player.getName() + " - " + wynik);
        });
    }
    
    public void winner(Player player){
        Integer wynik = listawynikow.getOrDefault(player, 0);
        wynik += 1;
        listawynikow.put(player, wynik);
    }
    
    public void clear(){
        listawynikow.clear();
    }
    
}
