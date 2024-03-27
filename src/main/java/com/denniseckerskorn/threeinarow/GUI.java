package com.denniseckerskorn.threeinarow;

import javax.swing.*;
import java.awt.*;

//User interface for the game 3 in a row:
public class GUI {
    private Player player1;
    private Player player2;
    private ThreeInARow threeInARow;
    private JTextField[][] cells;

    public GUI() {
        player1 = new Player("Dennis");
        player2 = new Player("Miriam");
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
        frame.setBounds(x, y, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        threeInARow = new ThreeInARow(3, 3, player1, player2, 3);
        JPanel gamePanel = new JPanel(new GridLayout(3, 3, 5, 5));

        cells = new JTextField[threeInARow.getRows()][threeInARow.getColumns()];

        for (int i = 0; i < threeInARow.getRows(); i++) {
            for (int j = 0; j < threeInARow.getColumns(); j++) {
                JTextField textField = new JTextField();
                textField.setEditable(true);
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                textField.setFont(new Font("Comic Sans", Font.BOLD, 24));
                gamePanel.add(textField);
                cells[i][j] = textField;
            }
        }

        frame.add(gamePanel);

        //Display Main Window:
        frame.setVisible(true);
    }
}
