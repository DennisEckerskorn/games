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

    public boolean switchPlayerTurn() {
        playerTurn = !playerTurn;
        return playerTurn;
    }

    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < columns) {
            if (isBoardEmpty(row, col)) {
                char symbol = getCurrentPlayer().getGameSymbols().toChar();
                gameBoard[row][col] = symbol;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //not finished
    public boolean checkWinningRows(int quantitySymbols, Player player) {
        char symbol = player.getGameSymbols().toChar();
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (gameBoard[i][j] == symbol) {
                    counter++;
                    if (counter == quantitySymbols) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public boolean isWinner() {
        char symbol1 = player1.getGameSymbols().toChar();
        char symbol2 = player2.getGameSymbols().toChar();

        for (int i = 0; i < rows; i++) {
            int counterSymbolsRowsP1 = 0;
            int counterSymbolsRowsP2 = 0;
            for (int j = 0; j < columns; j++) {
                if (gameBoard[i][j] == symbol1) {
                    counterSymbolsRowsP1++;
                    if (counterSymbolsRowsP1 == 3) {
                        player1.addPoint();
                        return true;
                    }

                    // Reset counter for player 2 if there's a symbol of player 1
                    counterSymbolsRowsP2 = 0;
                } else if (gameBoard[i][j] == symbol2) {
                    counterSymbolsRowsP2++;
                    if (counterSymbolsRowsP2 == 3) {
                        player2.addPoint();
                        return true;
                    }
                    // Reset counter for player 1 if there's a symbol of player 2
                    counterSymbolsRowsP1 = 0;
                } else {
                    counterSymbolsRowsP1 = 0;
                    counterSymbolsRowsP2 = 0;
                }
            }
        }

        for (int j = 0; j < columns; j++) {
            int counterSymbolsColumns1 = 0;
            int counterSymbolsColumns2 = 0;
            for (int i = 0; i < rows; i++) {
                if (gameBoard[i][j] == symbol1) {
                    counterSymbolsColumns1++;
                    if (counterSymbolsColumns1 == 3) {
                        player1.addPoint();
                        return true;
                    }
                    // Reset counter for player 2 if there's a symbol of player 1
                    counterSymbolsColumns2 = 0;
                } else if (gameBoard[i][j] == symbol2) {
                    counterSymbolsColumns2++;
                    if (counterSymbolsColumns2 == 3) {
                        player2.addPoint();
                        return true;
                    }
                    // Reset counter for player 1 if there's a symbol of player 2
                    counterSymbolsColumns1 = 0;
                } else {
                    counterSymbolsColumns1 = 0;
                    counterSymbolsColumns2 = 0;
                }
            }
        }

        return false;
    }


    public boolean isBoardEmpty(int rows, int cols) {
        return gameBoard[rows][cols] == ' ';
    }

    public Player getCurrentPlayer() {
        if (playerTurn) {
            return player1;
        } else {
            return player2;
        }
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

