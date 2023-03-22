package javaapplication1.Statistics;

import javaapplication1.Player.Player;

public interface Statistics { //interfejs jest w 100% abstrakcyjny i publiczny
    
    void print();
    void winner(Player player);
    void clear();
    
}
