package org.example.TicTacToePractice.Factories;

import org.example.TicTacToePractice.Models.BotDifficultyLevel;
import org.example.TicTacToePractice.Strategies.BotDifficultyLevelStrategy;
import org.example.TicTacToePractice.Strategies.EasyBotDifficultyStrategy;
import org.example.TicTacToePractice.Strategies.HardBotDifficultyStrategy;
import org.example.TicTacToePractice.Strategies.MediumBotDifficultyStrategy;

public class BotDifficultyStrategyFactory {
    public static BotDifficultyLevelStrategy getBotDifficultyStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY))
            return new EasyBotDifficultyStrategy();
        else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
            return new MediumBotDifficultyStrategy();
        else
            return new HardBotDifficultyStrategy();
    }
}
