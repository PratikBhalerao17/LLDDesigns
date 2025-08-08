package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.*;

import java.util.List;

public class EasyBotDifficultyStrategy implements BotDifficultyLevelStrategy{
    @Override
    public Move makeMove(Board board,List<Player> players, int nextPlayerIndex) {
        //We need to make move on the basis of empty cell which is first empty cell..
        for(List<Cell> rows:board.getBoard()){
            for (Cell cell:rows){
                if(cell.getCellStatus().equals(CellStatus.EMPTY))
                    return new Move(null,cell,null);
            }
        }
        return null;
    }
}
