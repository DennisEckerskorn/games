package com.denniseckerskorn.threeinarow;

import java.util.Arrays;
import java.util.Objects;

//Class for the game Logic
public class ThreeInARow {
    private final int rows;
    private final int columns;
    private final Player player1;
    private final Player player2;
    private final int rounds;
    private char[][] gameBoard;
    private boolean playerTurn;


    public ThreeInARow(int rows, int columns, Player player1, Player player2, int rounds) {
        this.rows = rows;
        this.columns = columns;
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
        gameBoard = new char[rows][columns];
        playerTurn = false;
        initializeGameBoard();
    }

    /**
     * Method to initialize an empty Game Board,
     * when the game board is full this method can be used to reset it.
     */
    private void initializeGameBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    /**
     * Method to check if the game board is full of symbols.
     *
     * @return {@code false} if one of the fields is empty, otherwise {@code true}
     */
    public boolean isFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (gameBoard[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Method to reset the gameBoard to empty fields.
     */
    private void resetGameBoard() {
        initializeGameBoard();
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getRounds() {
        return rounds;
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThreeInARow that = (ThreeInARow) o;

        if (rows != that.rows) return false;
        if (columns != that.columns) return false;
        if (rounds != that.rounds) return false;
        if (!Objects.equals(player1, that.player1)) return false;
        if (!Objects.equals(player2, that.player2)) return false;
        return Arrays.deepEquals(gameBoard, that.gameBoard);
    }

    @Override
    public int hashCode() {
        int result = rows;
        result = 31 * result + columns;
        result = 31 * result + (player1 != null ? player1.hashCode() : 0);
        result = 31 * result + (player2 != null ? player2.hashCode() : 0);
        result = 31 * result + rounds;
        result = 31 * result + Arrays.deepHashCode(gameBoard);
        return result;
    }

    @Override
    public String toString() {
        return "ThreeInARow{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", rounds=" + rounds +
                ", gameBoard=" + Arrays.toString(gameBoard) +
                '}';
    }
}
