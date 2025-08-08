package org.example.TicTacToePractice;
import org.example.TicTacToePractice.Controller.GameController;
import org.example.TicTacToePractice.Models.*;
import org.example.TicTacToePractice.Strategies.ColumnWinningStrategy;
import org.example.TicTacToePractice.Strategies.DiagonalWinningStrategy;
import org.example.TicTacToePractice.Strategies.RowsWinningStrategy;
import org.example.TicTacToePractice.Strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeMainClass {
    public static void main(String[] args) {

        Symbol s = new Symbol('X');
        Symbol s1 = new Symbol('O');
        List<Player> players = new ArrayList<>();
        players.add(new Player("Pratik",PlayerType.HUMAN,s));
        players.add(new Bot("BOT",PlayerType.BOT,s1,BotDifficultyLevel.HARD));

        List<WinningStrategies> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowsWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        int dimension = 3;

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension,players,winningStrategies);

        while (gameController.gameState(game).equals(GameStatus.INPROGRESS)){
            // Show the board
            // Make the move
            // Show the board
            gameController.printBoard(game);
            gameController.makeMove(game);

//            gameController.printBoard(game);
//            System.out.println("Board after making the move ");
        }
        gameController.printBoard(game);
        System.out.println("GAME ENDED");



    }
}
