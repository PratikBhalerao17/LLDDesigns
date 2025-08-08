package org.example.TicTacToe.Factories;

import org.example.TicTacToe.Models.BotDifficultyLevel;
import org.example.TicTacToe.Strategies.BotDifficultyStrategy.BotDifficultyStrategy;
import org.example.TicTacToe.Strategies.BotDifficultyStrategy.EasyBotDifficultyStrategy;
import org.example.TicTacToe.Strategies.BotDifficultyStrategy.HardBotDifficultyStrategy;
import org.example.TicTacToe.Strategies.BotDifficultyStrategy.MediumBotDifficultyStrategy;

public class BotDifficultyStrategyFactory {
//    private BotDifficultyLevel botDifficultyLevel;
    public static BotDifficultyStrategy getBotDifficultyStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY))
            return new EasyBotDifficultyStrategy();
        else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
            return new MediumBotDifficultyStrategy();
        else
            return new HardBotDifficultyStrategy();
    }
}
