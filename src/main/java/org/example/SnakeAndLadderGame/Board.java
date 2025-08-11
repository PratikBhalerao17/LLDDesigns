package org.example.SnakeAndLadderGame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer,Integer> snakesAndLadders;

    public Board(int size, List<Snake> snakes,List<Ladder> ladders) {
        this.size = size;
        this.snakesAndLadders =  new HashMap<>();

        for(Snake snake : snakes)
            snakesAndLadders.put(snake.getHead(),snake.getTail());

        for(Ladder ladder:ladders)
            snakesAndLadders.put(ladder.getStart(),ladder.getEnd());
    }
    public int nextValidPosition(int prevPos,int diceVal,String name){
        int oldVal = prevPos + diceVal;
        int addVal = oldVal;
        if(snakesAndLadders.containsKey(oldVal)){
            oldVal = snakesAndLadders.get(oldVal);
            if(oldVal < prevPos + diceVal)
                System.out.println("----------------- OOPS Player " + name + "  is eaten by snake and moved from "+ prevPos + " to " + oldVal);
            else
                System.out.println("!!!!!!!!!!!!!!!!! HURRAY Player " + name + " got the ladder and moved from "+ prevPos + " to " + oldVal);
//            System.out.println("You are moved from " + prevPos + diceVal + " to " + oldVal+ " !!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");

        }

        return oldVal;
    }
}
