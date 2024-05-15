package com.denniseckerskorn.engine.graphics.swing;

import com.denniseckerskorn.engine.graphics.RenderAPI;

import javax.swing.*;
import java.awt.*;

public class SwingRenderer extends JPanel implements RenderAPI {

    public SwingRenderer(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        setDoubleBuffered(true);
        setFocusable(true);
    }

    @Override
    public void render() {
        //TODO: Repaint - paintComponenet2D
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
