package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.Board;
import org.example.TicTacToePractice.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategies{
    private final Map<Character,Integer> leftToBottom = new HashMap<>();
    private final Map<Character,Integer> rightToBottom = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        char aChar = move.getSymbol().getaChar();

        if( row==col ){
            if(!leftToBottom.containsKey(aChar))
                leftToBottom.put(aChar,0);

            leftToBottom.put(aChar,leftToBottom.get(aChar)+1);
        }

        if( row+col == board.getDimension() -1 ){
            if(!rightToBottom.containsKey(aChar))
                rightToBottom.put(aChar,0);

            rightToBottom.put(aChar,rightToBottom.get(aChar)+1);
        }

        return ((row == col && leftToBottom.get(aChar).equals(board.getDimension())) ||
                (row+col == board.getDimension()-1 && rightToBottom.get(aChar).equals(board.getDimension())));

//        return false;
    }
}
