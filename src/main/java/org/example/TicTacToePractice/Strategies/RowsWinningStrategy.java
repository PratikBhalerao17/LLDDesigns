package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.Board;
import org.example.TicTacToePractice.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowsWinningStrategy implements WinningStrategies{

    public Map<Integer, HashMap<Character,Integer>> rowMaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();
        char aChar = move.getPlayer().getSymbol().getaChar();

        if(!rowMaps.containsKey(row)){
            rowMaps.put(row,new HashMap<Character,Integer>());
        }

        Map<Character,Integer> currentMap = rowMaps.get(row);

        if(!currentMap.containsKey(aChar)){
            currentMap.put(aChar,0);
        }

        currentMap.put(aChar,currentMap.get(aChar) + 1);

        return currentMap.get(aChar).equals(board.getDimension());
    }
}
