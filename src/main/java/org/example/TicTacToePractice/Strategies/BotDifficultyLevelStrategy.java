package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.Board;
import org.example.TicTacToePractice.Models.Move;
import org.example.TicTacToePractice.Models.Player;

import java.util.List;

public interface BotDifficultyLevelStrategy {
    Move makeMove(Board board, List<Player> players, int nextPlayerIndex);
}
