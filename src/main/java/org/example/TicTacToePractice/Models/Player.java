package org.example.TicTacToePractice.Models;

import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private PlayerType playerType;
    private Symbol symbol;
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, PlayerType playerType, Symbol symbol) {
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board board, List<Player> players, int nextPlayerIndex) {
        System.out.println("This is the "+ this.getName() +"'s turn");
        System.out.println("Enter the row number for input: ");
        int row = scanner.nextInt();
        System.out.println("Enter the col number for input: ");
        int col = scanner.nextInt();

        // Now we will create the move object using it.
        return new Move(this,new Cell(row,col),this.getSymbol());
//        return new Move(this,new Cell(row,col);

    }
}
