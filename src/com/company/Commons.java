package com.company;

//Oft genutzte Werte kommen hier hin :)

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public interface Commons {

    public static final int BOARD_WIDTH = 900;
    public static final int BOARD_HEIGHT = 600;
    public final BufferedImage menuBackground = ImageIO.read(this.getClass().getResource("backgroungMenu"))
}
