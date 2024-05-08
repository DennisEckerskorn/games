package com.denniseckerskorn.snake;

import javax.swing.*;

public class SnakeGameExecute {
    public SnakeGameExecute() {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Snake");

        SnakeGameWindow snakeGameWindow = new SnakeGameWindow(800, 600, 60);
        frame.add(snakeGameWindow);
        snakeGameWindow.start();
        frame.pack();
        frame.setVisible(true);
    }
}
