package com.company;

import javax.swing.*;
import java.awt.*;

public class Main implements Commons{

    public static void main(String[] args) {
        JFrame frame = new JFrame("SpaceInvaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel menuPanel = new JPanel();

        //Spielen Button
        JButton playButton = new JButton("Spielen");
        menuPanel.add(playButton);
        frame.add(menuPanel);
        //Größe setzen
        frame.setBounds(100, 100, BOARD_WIDTH, BOARD_HEIGHT);
        frame.setVisible(true);
        //Hintergrund

        

    }
}
