package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main implements Commons{



    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("SpaceInvaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JFrame
        frame.setBounds(100, 100, BOARD_WIDTH, BOARD_HEIGHT);
        frame.setVisible(true);
        frame.getBackground();

        //Menu Panel
        JPanel menuPanel = new JPanel();
        JButton playButton = new JButton("Spielen");
        menuPanel.add(playButton);

        //Menü Panel hinzufügen
        frame.add(menuPanel);







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
