package org.example.TicTacToe;

import org.example.PracticeDSA.DSA2025.String.ReverseStringWords;
import org.example.TicTacToe.Models.Game;
import org.example.TicTacToe.Models.Player;
import org.example.TicTacToe.Models.PlayerType;
import org.example.TicTacToe.Models.Symbol;
import org.example.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class TTTMain {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Symbol s = new Symbol('X');
        Symbol s1 = new Symbol('O');
        players.add(new Player("Pratik",s , PlayerType.HUMAN));
        players.add(new Player("Rakesh",s1 , PlayerType.HUMAN));
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        Game game = Game.getBuilder().
                setDimension(3)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                        .build();

        game.printBoard();

    }
}
