package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("SpaceInvaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        //Schließen Button
        JButton closeButton = new JButton("Hallo Phillip!");
        contentPane.add(closeButton);
//Wir lieben unseren Phillip <3!
        //Größe setzen
        frame.setBounds(50, 50, 300, 200);
        frame.setVisible(true);
    }
}
