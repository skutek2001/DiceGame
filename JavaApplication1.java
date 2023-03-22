package javaapplication1;

import javaapplication1.Statistics.WinStatistics;
import javaapplication1.Player.PlayerComp;

/**
 * Gra w odgadywanie wylosowanej liczby.
 *
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */

public class JavaApplication1 {

    public static void main(String[] args) {
        Game game = new Game(new WinStatistics());
        //Player player = new PlayerComp("Kuba");
        //game.addPlayer(new PlayerComp("Kuba"));
        game.addPlayer(new PlayerComp("Krystian"));
        game.addPlayer(new PlayerComp("Kuba"));
        game.addPlayer(new PlayerComp("Zocha"));
        
        game.printPlayers();
        //game.removePlayer("Zocha");
        //game.printPlayers();
        for(int i=0;i<3;i++){
            game.play();
        }
        
        game.printStats();
        game.clearStats();
    }
}