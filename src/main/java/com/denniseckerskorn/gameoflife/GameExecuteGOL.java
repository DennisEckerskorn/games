package com.denniseckerskorn.gameoflife;

import javax.swing.*;

public class GameExecuteGOL {
    public GameExecuteGOL() {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Game Of Life");

        GameWindow gameWindow = new GameWindow(1200, 968, 10);
        frame.add(gameWindow);
        gameWindow.start();
        frame.pack();
        frame.setVisible(true);
    }
}
