package org.example.TicTacToe.Models;

import org.example.TicTacToe.Strategies.BotDifficultyStrategy.BotDifficultyStrategy;

public class Bot extends Player{
    private BotDifficultyStrategy botDifficultyStrategy;
    private BotDifficultyLevel botDifficultyLevel;


    public Bot(String name, Symbol symbol, PlayerType playerType) {
        super(name, symbol, playerType);
    }
}
