package javaapplication1;

import javaapplication1.Statistics.Statistics;
import javaapplication1.Statistics.NullStatistics;
import javaapplication1.Player.Player;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    /*
    List<String> list = new ArrayList();
    list.add("cos");
    list.add("cos1");
    list.add("cos2");
    list.add("cos3");
    
    Iterator iterator = list.iterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
    
    for(Iterator<string> it = list.iterator());
        it.hasNext();
        System.out.println(it.next());
    
    */
    private Statistics stats;
    private Random rand = new Random();     //obiekt losujący
    private List<Player> players = new ArrayList();
    
    private Player player;
    public Game(){
        //this.stats = new NullStatistics();
        this(null);
    }
    
    public Game(Statistics stats){
        if(stats != null){
            this.stats = stats;
        }
        else
            this.stats = new NullStatistics();
    }
    
    public void addPlayer(Player player) {
        if(!istnieje(player.getName())){
            players.add(player);
        }
        else{
            player.setName(player.getName() + rand.nextInt(10));
            addPlayer(player);
        }
    }
    
    boolean istnieje(String name){
        for (Player player : players){
            if(player.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void play() {
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        boolean repeat;
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);
            
            
            repeat = true;
            for(Player player : players){
                guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);
                
                if (number == guess) {
                    System.out.println("BRAWO!");
                    stats.winner(player);
                    repeat = false;
                }
                else{
                    System.out.println("PUDŁO!");
                }
            }
        } while (repeat);
    }
    
    public void printPlayers(){
            for(Player player : players){
                System.out.println(player.getName());
            }
            //inna metoda
            //players.forEach(player -> System.out.println(player.getName()));
        }
    
    public void removePlayer(String name){
                players.removeIf((player) -> player.getName().equals(name));
            
    }
    
    public void printStats(){
        stats.print();
    }
    
    public void clearStats(){
        stats.clear();
    }
}
