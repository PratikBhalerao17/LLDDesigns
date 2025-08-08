package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.*;

public interface WinningStrategies {
    public boolean checkWinner(Move move, Board board);
}
