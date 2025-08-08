package org.example.TicTacToe.Strategies.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
