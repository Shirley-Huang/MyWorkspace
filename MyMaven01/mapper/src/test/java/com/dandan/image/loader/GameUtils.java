package com.dandan.image.loader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtils {

    public static Image getImage(String path){
        URL url = GameUtils.class.getClassLoader().getResource(path);
        BufferedImage image = null;

        try{
            image = ImageIO.read(url);
        }catch (IOException e){
            e.printStackTrace();
        }
        return image;
    }

}
