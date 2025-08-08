package org.example.TicTacToePractice.Controller;

import org.example.TicTacToePractice.Models.Game;
import org.example.TicTacToePractice.Models.GameStatus;
import org.example.TicTacToePractice.Models.Move;
import org.example.TicTacToePractice.Models.Player;
import org.example.TicTacToePractice.Strategies.WinningStrategies;

import java.util.List;

public class GameController {
    private List<Player> players;
    private int dimension;
    private List<WinningStrategies> winningStrategies;


//    public GameController(List<Player> players, int dimension, List<WinningStrategies> winningStrategies) {
//        this.players = players;
//        this.dimension = dimension;
//        this.winningStrategies = winningStrategies;
//    }

    public Game startGame(int dimension, List<Player> players, List<WinningStrategies> winningStrategies) {
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public GameStatus gameState(Game game) {
        return game.getGameStatus();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }
}
