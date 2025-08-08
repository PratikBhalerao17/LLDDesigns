package org.example.TicTacToe.Strategies.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
