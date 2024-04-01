package com.denniseckerskorn.threeinarow;

public enum GameSymbols {
    X("X"),
    O("O");

    private String symbol;

    /**
     * Constructor for the available Game Symbols:
     */
    GameSymbols(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter to obtain the game symbol of the enumeration
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    public char toChar() {
        return symbol.charAt(0);
    }

}
