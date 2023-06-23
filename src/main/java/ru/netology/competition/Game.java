package ru.netology.competition;

import java.util.HashMap;

public class Game {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player){
        players.put(player.getName(), player);
    }

    public Player findByName(String name) {
        Player playerTmp = players.get(name);
        if(playerTmp != null){
            return playerTmp;
        }
        throw new NotRegisteredException("Player " + name + " is not registered");
    }

    public int round(String playerName1, String playerName2) {
        int player1Strength = findByName(playerName1).getStrength();
        int player2Strength = findByName(playerName2).getStrength();
        if (player1Strength > player2Strength) {
            return 1;
        } else if (player1Strength < player2Strength) {
            return -1;
        } else {
            return 0;
        }
    }
}
