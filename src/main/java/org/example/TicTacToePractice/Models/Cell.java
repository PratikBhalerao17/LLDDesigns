package org.example.TicTacToePractice.Models;

public class Cell {
    private int row;
    private int col;
    private Player player;
    private CellStatus cellStatus;

    public Cell(int row, int col) {
        // While creating the cell for first time we need row and col only
        // the cell status will be empty and player will not be available.
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public void display() {
        if(player == null){
            // Put empty cell
            System.out.print("|-|");
        }
        else
            System.out.print("|" + player.getSymbol().getaChar() + "|");
    }
}
