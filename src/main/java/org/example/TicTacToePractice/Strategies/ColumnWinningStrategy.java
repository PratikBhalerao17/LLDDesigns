package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.Board;
import org.example.TicTacToePractice.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategies{
    Map<Integer, HashMap<Character,Integer>> colMaps =  new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        int col = move.getCell().getCol();
        char aChar = move.getSymbol().getaChar();

        if(!colMaps.containsKey(col)){
            colMaps.put(col,new HashMap<Character,Integer>());
        }

        Map<Character,Integer> currentMap = colMaps.get(col);

        if(!currentMap.containsKey(aChar)){
            currentMap.put(aChar,0);
        }

        currentMap.put(aChar,currentMap.get(aChar)+1);

        return currentMap.get(aChar).equals(board.getDimension());
    }
}
