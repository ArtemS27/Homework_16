package ru.netology.competition;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public Player findByName(String name) {
        for (Player player : players) {
            if (player.getName() == name) {
                return player;
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
