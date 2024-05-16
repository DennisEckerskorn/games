package com.denniseckerskorn;

import com.denniseckerskorn.game.config.Settings;
import com.denniseckerskorn.game.core.SnakeGame;
import com.denniseckerskorn.game.graphics.SnakeSwingRenderer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Three in a Row:
        //GUI gui = new GUI();


        //Game Of Life:
        //GameExecuteGOL gameExecuteGOL = new GameExecuteGOL();


        //Snake
        //SnakeGameExecute snakeGameExecute = new SnakeGameExecute();
        SnakeGame snakeGame = new SnakeGame(Settings.WIDTH, Settings.HEIGHT, Settings.ROWS, Settings.COLS, Settings.TARGET_FPS);
        SnakeSwingRenderer snakeSwingRenderer = new SnakeSwingRenderer(Settings.WIDTH, Settings.HEIGHT);
        snakeGame.setRenderAPI(snakeSwingRenderer);
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.pack();
        frame.add(snakeSwingRenderer);
        frame.setVisible(true);
        snakeGame.start();


    }
}