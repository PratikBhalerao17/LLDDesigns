package org.example.TicTacToe.Models;

import org.example.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private Player winner;
    private int nextMovePlayerIndex;
    private int dimension;
    private List<WinningStrategy> winningStrategies;

    public void printBoard(){
        board.printBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    private Game(List<Player> players, List<WinningStrategy> winningStrategies, int dimension) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.dimension = dimension;
        this.board = new Board(dimension);
        this.gameStatus = GameStatus.INPROGRESS;
        this.nextMovePlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }


    public static class Builder {
//        private Board board;
//        private List<Move> moves;
//        private GameStatus gameStatus;
//        private Player winner;
//        private int nextMovePlayerIndex;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        public List<Player> getPlayers() {
            return players;
        }


        private Builder() {
            this.players = new ArrayList<>();
            this.dimension = 0;
            this.winningStrategies = new ArrayList<>();
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Game build(){
            return new Game(players,winningStrategies,dimension);
        }
    }
}
