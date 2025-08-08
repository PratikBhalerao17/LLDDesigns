package org.example.TicTacToePractice.Models;


import org.example.TicTacToePractice.Strategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Move> moves;
    private int dimension;
    private List<Player> players;
    private GameStatus gameStatus;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategies> winningStrategies;

    private Game(List<WinningStrategies> winningStrategies, List<Player> players, int dimension) {
        this.board = new Board(dimension);
        this.moves =  new ArrayList<>();
        this.dimension = dimension;
        this.players = players;
        this.gameStatus = GameStatus.INPROGRESS;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public void printBoard(){
        board.printBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
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

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
    public boolean moveValidations(Move move){
        // 1. if row and  col is out of bounds
        // 2. if cell is already filled
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if(row < 0 || col < 0 || row >= board.getDimension() || col >= board.getDimension())
            return false;

        if(!board.getBoard().get(row).get(col).getCellStatus().equals(CellStatus.EMPTY))
            return false;

        return true;
    }

    public boolean checkWinner(Move move){
        for(WinningStrategies winningStrategies: winningStrategies){
            if(winningStrategies.checkWinner(move,board))
                return true;
        }
        return false;
    }

    public void makeMove() {
        // We want to make the move here on use input so we give it to player
        // get current player index
        // Print who is playing --> Inside Player class
        // Take inputs --> Inside Player class
        // Validate inputs
        // Call move object with latest cell
        Player currentPlayer = players.get(nextPlayerIndex); // The list of players object for next player
//        if(currentPlayer instanceof Player)
//            System.out.println("Current player is instance of player");
//        if(currentPlayer instanceof Bot)
//            System.out.println("Current player is instance of BOT");

        Move currentMove = currentPlayer.makeMove(board,players,nextPlayerIndex);


        // Now we get the move object now perform the validations
        if (!moveValidations(currentMove)){
            throw new RuntimeException("Invalid user inputs for rows and columns");
        }

        int row = currentMove.getCell().getRow();
        int col =  currentMove.getCell().getCol();


        // Then place move on board object
        Cell currentCell = board.getBoard().get(row).get(col); // We are getting the exact cell on Board
        currentCell.setPlayer(currentPlayer);
        currentCell.setCellStatus(CellStatus.FILLED);
        Symbol currentSym = currentPlayer.getSymbol();

        Move FinalMove = new Move(currentPlayer,currentCell,currentSym);
        moves.add(FinalMove);

        // Now update the index for next player
        nextPlayerIndex = (nextPlayerIndex+1) % players.size();

        // Now winning logic check we need to iterate over all the winning strategy based on the latest move
        if(checkWinner(FinalMove)){
            winner = currentPlayer;
            gameStatus = GameStatus.ENDED;
            System.out.println("CONGRATULATIONS "+"player " + currentPlayer.getName() + " has won the game!!!!!!");
        }
        else if(moves.size() == board.getDimension() * board.getDimension()){
            gameStatus = GameStatus.DRAW;
            System.out.println("Nobody won the game and it's a DRAW!!!!!");
        }

    }

    public static class Builder{
//        private Board board;
//        private List<Move> moves;
//        private GameStatus gameStatus;
//        private Player winner;
//        private int nextPlayerIndex;

        private List<WinningStrategies> winningStrategies;
        private int dimension;
        private List<Player> players;

//        public Builder(List<WinningStrategies> winningStrategies,List<Player> players, int dimension) {
//            this.winningStrategies = winningStrategies;
//            this.dimension = dimension;
//            this.players = players;
//        }

        public Builder() {

        }

        public List<WinningStrategies> getWinningStrategies() {
            return winningStrategies;
        }

        public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
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

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build(){
            // validations

            //create the Game object
            return new Game(winningStrategies,players,dimension);
        }


    }
}
