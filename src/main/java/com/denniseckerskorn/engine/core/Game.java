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
        long lastFrame = System.nanoTime();

        System.out.println("Iniciando hilo ...");
        while (!finished) {
            currentFrame = System.nanoTime();
            double deltaTime = (currentFrame - lastFrame) / 1000_000_000.0;
            if (currentFrame - lastFrame > NANOS_BETWEEN_UPDATES) {
                processInput();

                //Representa el tiempo transcurrido desde el último fotograma.
                //Actualizaciones lógicas del juego, como el movimiento de objetos,
                // la detección de colisiones, la lógica de la IA, etc.
                update(deltaTime);

                //Realizar cualquier acción adicional que necesita realizarse
                // después de la actualización principal del juego.
                // Por ejemplo, puedes realizar ajustes finales en el estado de los objetos,
                // generar eventos basados en el estado actual, etc.
                postUpdate(deltaTime);

                //Útil para realizar acciones que deben llevarse a cabo después
                // de que se hayan realizado todas las actualizaciones principales del juego
                // y justo antes de renderizar el siguiente fotograma.
                // Limpiar recursos, actualizar información de interfaz de usuario,
                // o realizar cualquier tarea final antes de renderizar.
                lastUpdate(deltaTime);

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