package org.example.SnakeAndLadderGame;

import org.example.SnakeAndLadderGame.exceptions.InvalidBoardSizeException;
import org.example.SnakeAndLadderGame.exceptions.InvalidDiceParms;
import org.example.SnakeAndLadderGame.exceptions.InvalidPlayerSizeException;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Queue<Player> players;
    private Board board;
    private Dice dice;
    private Player winner;
    private GameStatus gameStatus;
    private int boardSize;

    public static Builder getBuilder(){
        return new Builder();
    }

    public Game(Builder builder) {
        this.players = builder.players;
        this.board = builder.board;
        this.dice = builder.dice;
        this.boardSize = builder.boardSize;
        this.gameStatus = GameStatus.RUNNING;
    }

    public void play(){
        System.out.println("We are playing the game");

        while (winner == null){
            Player currentPlayer = players.peek();
            int diceVal = dice.roll();
            System.out.println("Dice is rolled by "+ currentPlayer.getName() +" dice value is " + diceVal);
            int nextVal = board.nextValidPosition(currentPlayer.getPosition(),diceVal,currentPlayer.getName());
            if(nextVal <= boardSize) {
                System.out.println("Player " + currentPlayer.getName() + " moved from " + currentPlayer.getPosition() + " to " + nextVal);
                currentPlayer.setPosition(nextVal);
            }
            if(nextVal == boardSize) {
                System.out.println("!!!!!!!!!!!!!!!!! HURRAY Player " + currentPlayer.getName() + " won the game !!!!!!!!!!!!!!!!!!!!!!");
                currentPlayer.setPosition(nextVal);
                break;
            }
            if(diceVal != 6 || nextVal > boardSize) {
                players.poll();
                players.offer(currentPlayer);
            }
            else{
                System.out.println(currentPlayer.getName() + " got solid 6 and will play again");
            }
        }
    }

    public static class Builder{
        private Queue<Player> players = new LinkedList<>();
        private Board board;
        private int boardSize;
        private List<Snake> snakes;
        private List<Ladder> ladders;
        private Dice dice;

//        public Builder(List<String> playersNames, int boardSize, List<Snake> snakes, List<Ladder> ladders,Dice dice) {
//            for(String name: playersNames)
//                this.players.add(new Player(name));
//            this.boardSize = boardSize;
//            this.snakes = snakes;
//            this.ladders = ladders;
//            this.dice = dice;
//        }

        public Builder setPlayers(List<String> playersNames) {
            for(String name: playersNames)
                this.players.add(new Player(name));
            return this;
        }

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setBoardSize(int boardSize) {
            this.boardSize = boardSize;
            return this;
        }

        public Builder setSnakes(List<Snake> snakes) {
            this.snakes = snakes;
            return this;
        }

        public Builder setLadders(List<Ladder> ladders) {
            this.ladders = ladders;
            return this;
        }

        public Builder setDice(Dice dice) {
            this.dice = dice;
            return this;
        }

        public Game build() throws InvalidPlayerSizeException, InvalidBoardSizeException, InvalidDiceParms {
            //First check all the conditions like player count > 1 && Board size !=0 then create new board
            if(players.size() <= 1)
                throw new InvalidPlayerSizeException("Player size must be greater than 1");

            if(boardSize == 0)
                throw new InvalidBoardSizeException("Board size must be greater than 0");

            if(dice == null || (dice.getMin() == dice.getMax()))
                throw new InvalidDiceParms("Enter the dice params again");

            //Now create the board object
            board = new Board(boardSize,snakes,ladders);
            return new Game(this);
        }
    }
}
