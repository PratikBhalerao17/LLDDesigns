package org.example.TicTacToePractice.Models;

import org.example.TicTacToePractice.Factories.BotDifficultyStrategyFactory;
import org.example.TicTacToePractice.Strategies.BotDifficultyLevelStrategy;

import java.util.List;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotDifficultyLevelStrategy botDifficultyLevelStrategy;

//    public Bot(BotDifficultyLevel botDifficultyLevel) {
//        super();
//        this.botDifficultyLevel = botDifficultyLevel;
//        this.botDifficultyLevelStrategy = BotDifficultyStrategyFactory.getBotDifficultyStrategy(botDifficultyLevel);
//    }


    public Bot(String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, playerType, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botDifficultyLevelStrategy = BotDifficultyStrategyFactory.getBotDifficultyStrategy(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevelStrategy getBotDifficultyLevelStrategy() {
        return botDifficultyLevelStrategy;
    }

    public void setBotDifficultyLevelStrategy(BotDifficultyLevelStrategy botDifficultyLevelStrategy) {
        this.botDifficultyLevelStrategy = botDifficultyLevelStrategy;
    }

    public Move makeMove(Board board, List<Player> players, int nextPlayerIndex) {
        // 1. As per the strategy create bot playing level
//        System.out.println("This is the "+ this.getName() +"'s turn");
        return botDifficultyLevelStrategy.makeMove(board,players,nextPlayerIndex);
//        System.out.println("Enter the row number for input: ");
//        int row = scanner.nextInt();
//        System.out.println("Enter the col number for input: ");
//        int col = scanner.nextInt();
//
//        // Now we will create the move object using it..
//        return new Move(this,new Cell(row,col),this.getSymbol());
//        return new Move(this,new Cell(row,col);
    }


}
