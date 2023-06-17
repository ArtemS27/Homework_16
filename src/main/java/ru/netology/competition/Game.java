package ru.netology.competition;

import java.util.HashMap;

public class Game {
    HashMap<String, Player> players = new HashMap<>();

    public void register(Player player){
        players.put(player.getName(), player);
    }

    public Player findByName(String name) {
        for (String key : players.keySet()) {
            if (key == name) {
                return players.get(key);
            }
        }
        throw new NotRegisteredException("Player " + name + " is not registered");
    }

    public int round(String playerName1, String playerName2) {
        if (findByName(playerName1).getStrength() > findByName(playerName2).getStrength()) {
            return 1;
        } else if (findByName(playerName1).getStrength() < findByName(playerName2).getStrength()) {
            return -1;
        } else {
            return 0;
        }
    }
}
