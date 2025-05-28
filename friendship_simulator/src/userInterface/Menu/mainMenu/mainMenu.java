package userInterface.Menu.mainMenu;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gameAssets.Player_And_Friend.*;

public class mainMenu {

    public void createWindow() {
        JFrame frame = new JFrame("Friendship simulator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton startButton = new JButton("Start game");
        JButton optionsButton = new JButton("Options");
        JButton exitButton = new JButton("Exit game");

        // Add action listener to exitButton
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(startButton);
        panel.add(optionsButton);
        panel.add(exitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}