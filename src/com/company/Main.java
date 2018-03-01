package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main {



    public static void main(String[] args) throws IOException {
        JFrame SpielFenster = new JFrame("SpaceInvaders - Work in Progress - 0.0.1");
        SpielFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JFrame
        SpielFenster.setBounds(0, 0, 800, 600);
        SpielFenster.setVisible(true);
        SpielFenster.getBackground();
        SpielFenster.setResizable(false);

        //Menu Panel
        JPanel menuPanel = new JPanel();
        JButton playButton = new JButton("Spielen");
        menuPanel.add(playButton);

        //Menü Panel hinzufügen
        SpielFenster.add(menuPanel);







    }
    //möglichkeit zum Einfügen eines normalen Bilds
    class ImagePanel extends JComponent {
        private Image image;
        public ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }
}
