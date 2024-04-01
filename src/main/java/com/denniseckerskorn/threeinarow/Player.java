package com.denniseckerskorn.threeinarow;

import java.util.Objects;

//Class for the player:
public class Player {
    private final String playerName;
    private GameSymbols gameSymbols;
    private int playerPoints;


    public Player(String playerName, GameSymbols gameSymbols) {
        this.playerName = playerName;
        this.gameSymbols = gameSymbols;
        playerPoints = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    /**
     * Method to increase the playerPoints by 1.
     */
    public void addPoint() {
        playerPoints++;
    }

    /**
     * Method to reset the playerPoints to 0.
     */
    public void resetPoints() {
        playerPoints = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (playerPoints != player.playerPoints) return false;
        return Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        int result = playerName != null ? playerName.hashCode() : 0;
        result = 31 * result + playerPoints;
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerPoints=" + playerPoints +
                '}';
    }
}
