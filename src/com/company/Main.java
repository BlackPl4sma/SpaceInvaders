package com.company;

import javax.swing.*;
import java.awt.*;

public class Main implements Commons{

    public static void main(String[] args) {
        JFrame frame = new JFrame("SpaceInvaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        //Schließen Button
        JButton closeButton = new JButton("Hallo Phillip!");
        contentPane.add(closeButton);

        //Größe setzen
        frame.setBounds(100, 100, BOARD_WIDTH, BOARD_HEIGHT);
        frame.setVisible(true);
    }
}
