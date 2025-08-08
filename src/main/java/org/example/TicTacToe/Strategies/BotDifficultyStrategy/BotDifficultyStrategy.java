package org.example.TicTacToe.Strategies.BotDifficultyStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

public interface BotDifficultyStrategy {
    Move makeMove(Board board);
}
