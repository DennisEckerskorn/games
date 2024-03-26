package com.denniseckerskorn.threeinarow;

import javax.swing.*;
import java.awt.*;

//User interface for the game 3 in a row:
public class GUI {
    private Player player1;
    private Player player2;
    private GameSymbols symbol;
    private ThreeInARow threeInARow;
    public GUI() {
        //Frame size:
        int width = 800;
        int height = 600;

        //Tools and dimension to center the screen when it opens:
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int x = (int) (dimension.getWidth() / 2f) - Math.round(width / 2f);
        int y = (int) (dimension.getHeight() / 2f) - Math.round(height / 2f);

        //Frame Main Window:
        JFrame frame = new JFrame("Three in a Row");
        frame.setBounds(x,y,width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //Display Main Window:
        frame.setVisible(true);
    }
}
