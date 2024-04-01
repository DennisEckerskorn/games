package com.denniseckerskorn.threeinarow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//User interface for the game 3 in a row:
public class GUI {
    private Player player1;
    private Player player2;
    private ThreeInARow threeInARow;
    private JTextField[][] cells;

    public GUI() {
        //Frame size:
        int width = 800;
        int height = 600;

        //Tools and dimension to center the screen when frame opens:
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int x = (int) (dimension.getWidth() / 2f) - Math.round(width / 2f);
        int y = (int) (dimension.getHeight() / 2f) - Math.round(height / 2f);

        //Frame Main Window:
        JFrame frame = new JFrame("Three in a Row");
        frame.setBounds(x, y, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //When the game starts it asks for the name of the player:
        JPanel startPanel = new JPanel(null);

        JLabel player1Label = new JLabel("Player 1 Name:");
        player1Label.setBounds(40, 50, 100, 100);
        JTextField player1NameField = new JTextField();
        player1NameField.setBounds(145, 90, 200, 20);

        JLabel player2Label = new JLabel("Player 2 Name:");
        player2Label.setBounds(40, 100, 100, 100);
        JTextField player2NameField = new JTextField();
        player2NameField.setBounds(145, 140, 200, 20);

        JButton startButton = new JButton("Start Game");
        startButton.setBounds(80, 180, 120, 30);

        startPanel.add(player1Label);
        startPanel.add(player1NameField);
        startPanel.add(player2Label);
        startPanel.add(player2NameField);
        startPanel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player1Name = player1NameField.getText().trim();
                String player2Name = player2NameField.getText().trim();

                if (!player1Name.isEmpty() && !player2Name.isEmpty()) {
                    player1 = new Player(player1Name, GameSymbols.X);
                    player2 = new Player(player2Name, GameSymbols.O);
                    startGame(player1, player2, frame);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter names for both players");
                }
            }
        });

        frame.add(startPanel);


        //Display Main Window:
        frame.setVisible(true);
    }

    private void startGame(Player player1, Player player2, JFrame frame) {
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

        //Creates the pointsPanel:
        JPanel pointsPanel = new JPanel(new GridLayout(2,2,5,5));
        JLabel labelName1 = new JLabel(player1.getPlayerName());
        JLabel labelName2 = new JLabel(player2.getPlayerName());
        JLabel pointsPlayer1 = new JLabel("Points " + player1.getPlayerPoints());
        JLabel pointsPlayer2 = new JLabel("Points " + player2.getPlayerPoints());

        pointsPanel.add(labelName1);
        pointsPanel.add(pointsPlayer1);
        pointsPanel.add(labelName2);
        pointsPanel.add(pointsPlayer2);

        frame.getContentPane().removeAll();
        frame.setLayout(new BorderLayout());
        frame.add(pointsPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();
    }
}
