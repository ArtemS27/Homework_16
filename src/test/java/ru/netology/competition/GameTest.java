package ru.netology.competition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {

    private Game game = new Game();

    Player player1 = new Player(15, "John", 45);
    Player player2 = new Player(18, "Mike", 50);
    Player player3 = new Player(5, "Spike", 45);
    Player player4 = new Player(9, "Kyle", 60);

    @Test
    void firstPlayerHasMoreStrength() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 1;
        int actual = game.round("Mike", "John");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void secondPlayerHasMoreStrength() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = -1;
        int actual = game.round("Spike", "Kyle");
    }

    @Test
    void playersHaveEqualStrength() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 0;
        int actual = game.round("John", "Spike");
    }

    @Test
    void playerIsNotRegistered() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Kyle", "Alex"));
    }
}
