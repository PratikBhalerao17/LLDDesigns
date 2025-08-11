package org.example.SnakeAndLadderGame;

import javax.swing.plaf.ScrollBarUI;
import java.util.List;

public class GameDemo {
    public static void main(String[] args) {
        //From here I will pass the players names, board size , snakes and ladder positions
        int boardSize = 100;
        List<String> players = List.of("Pratik","Alex","Justin");
        List<Snake> snakes = List.of(new Snake(33,11),new Snake(95,55),new Snake(77,23),new Snake(27,5));

        List<Ladder> ladders = List.of(new Ladder(8,24),new Ladder(15,41),new Ladder(56,93),new Ladder(75,91));
        try {
            Game game = Game.getBuilder()
                    .setPlayers(players)
                    .setBoardSize(boardSize)
                    .setDice(new Dice(1, 6))
                    .setLadders(ladders)
                    .setSnakes(snakes)
                    .build();

            game.play();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // And will call the game object and start method play on it.
    }
}
