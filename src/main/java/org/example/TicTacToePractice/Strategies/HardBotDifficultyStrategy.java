package org.example.TicTacToePractice.Strategies;

import org.example.TicTacToePractice.Models.*;

import java.util.List;

public class HardBotDifficultyStrategy implements BotDifficultyLevelStrategy {

    @Override
    public Move makeMove(Board board, List<Player> players, int nextPlayerIndex) {
        Player botPlayer = players.get(nextPlayerIndex);
        Player opponentPlayer = players.get(1 - nextPlayerIndex);
        System.out.println("Bot is making the Move");

        int bestScore = Integer.MIN_VALUE;
        Move bestMove = null;

        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellStatus() == CellStatus.EMPTY) {
                    // Simulate the bot's move
                    cell.setCellStatus(CellStatus.FILLED);
                    cell.setPlayer(botPlayer);

                    int score = minimax(board, false, botPlayer, opponentPlayer);

                    // Undo move
                    cell.setCellStatus(CellStatus.EMPTY);
                    cell.setPlayer(null);

                    if (score > bestScore) {
                        bestScore = score;
                        bestMove = new Move(botPlayer, cell, null);
                    }
                }
            }
        }

        // Fallback if somehow no move is selected (shouldn't happen)
        if (bestMove == null) {
            for (List<Cell> row : board.getBoard()) {
                for (Cell cell : row) {
                    if (cell.getCellStatus() == CellStatus.EMPTY) {
                        return new Move(botPlayer, cell, null);
                    }
                }
            }
        }

        return bestMove;
    }

    private int minimax(Board board, boolean isMaximizing, Player bot, Player opponent) {
        if (isWinner(board, bot)) return 10;
        if (isWinner(board, opponent)) return -10;
        if (isDraw(board)) return 0;

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (List<Cell> row : board.getBoard()) {
                for (Cell cell : row) {
                    if (cell.getCellStatus() == CellStatus.EMPTY) {
                        cell.setCellStatus(CellStatus.FILLED);
                        cell.setPlayer(bot);

                        int score = minimax(board, false, bot, opponent);

                        cell.setCellStatus(CellStatus.EMPTY);
                        cell.setPlayer(null);

                        bestScore = Math.max(bestScore, score);
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (List<Cell> row : board.getBoard()) {
                for (Cell cell : row) {
                    if (cell.getCellStatus() == CellStatus.EMPTY) {
                        cell.setCellStatus(CellStatus.FILLED);
                        cell.setPlayer(opponent);

                        int score = minimax(board, true, bot, opponent);

                        cell.setCellStatus(CellStatus.EMPTY);
                        cell.setPlayer(null);

                        bestScore = Math.min(bestScore, score);
                    }
                }
            }
            return bestScore;
        }
    }

    private boolean isWinner(Board board, Player player) {
        List<List<Cell>> grid = board.getBoard();

        // Rows
        for (List<Cell> row : grid) {
            if (row.stream().allMatch(cell -> player.equals(cell.getPlayer()))) {
                return true;
            }
        }

        // Columns
        for (int col = 0; col < 3; col++) {
            if (player.equals(grid.get(0).get(col).getPlayer()) &&
                    player.equals(grid.get(1).get(col).getPlayer()) &&
                    player.equals(grid.get(2).get(col).getPlayer())) {
                return true;
            }
        }

        // Diagonal 1
        if (player.equals(grid.get(0).get(0).getPlayer()) &&
                player.equals(grid.get(1).get(1).getPlayer()) &&
                player.equals(grid.get(2).get(2).getPlayer())) {
            return true;
        }

        // Diagonal 2
        if (player.equals(grid.get(0).get(2).getPlayer()) &&
                player.equals(grid.get(1).get(1).getPlayer()) &&
                player.equals(grid.get(2).get(0).getPlayer())) {
            return true;
        }

        return false;
    }

    private boolean isDraw(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellStatus() == CellStatus.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
