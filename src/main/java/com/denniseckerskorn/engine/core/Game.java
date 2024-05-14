package com.denniseckerskorn.engine.core;

import javax.swing.*;
import java.awt.*;

public class Game implements Runnable, Updateable {
    private final int width;
    private final int height;
    private final float fpsLimit;
    private Thread thread;
    private boolean finished;

    public Game(int width, int height, float fpsLimit) {
        this.width = width;
        this.height = height;
        this.fpsLimit = fpsLimit;
        this.finished = false;
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        final double NANOS_BETWEEN_UPDATES = 1_000_000_000 / fpsLimit;
        long currentFrame;
        long lastFrame = currentFrame = System.nanoTime();

        System.out.println("Iniciando hilo ...");
        while (!finished) {
            currentFrame = System.nanoTime();
            if (currentFrame - lastFrame > NANOS_BETWEEN_UPDATES) {
                processInput();
                //TODO: ajustar y sacar deltatime
                update();
                render();
                lastFrame = currentFrame;
            }
        }
    }

    private void render() {

    }
    @Override
    public void update(double deltaTime) {

    }

    @Override
    public void lastUpdate(double deltaTime) {

    }

    @Override
    public void postUpdate(double deltaTime) {

    }

    private void processInput() {

    }
}
