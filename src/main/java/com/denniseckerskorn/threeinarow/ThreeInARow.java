package com.denniseckerskorn.threeinarow;

//Class for the game Logic
public class ThreeInARow {
    private final int rows;
    private final int columns;
    private final Player player1;
    private final Player player2;
    private final int rounds;
    private char[][] gameBoard;


    public ThreeInARow(int rows, int columns, Player player1, Player player2, int rounds) {
        this.rows = rows;
        this.columns = columns;
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
        gameBoard = new char[rows][columns];
        /*
        initializeGameBoard();
         */
    }


}
