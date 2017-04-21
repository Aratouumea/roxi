/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Aratouumea
 */
public class ImgResizer {

    static final public ImageIcon resizeImage(Image image, int width, int height) {

        // image - BufferedImage object of your file selected
        // width - Width of your JLabel
        // height - Height of yout JLabel
        // Creating a temporary Image of your desired size.
        BufferedImage tempImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = tempImg.createGraphics();

        g.drawImage(image, 0, 0, width, height, null);
        g.dispose();

        return new ImageIcon(tempImg);
    }

//    public static final Image resizeToImage(Image image, int width, int height){
//    BufferedImage tempImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g = tempImg.createGraphics();
//
//        g.drawImage(image, 0, 0, width, height, null);
//        g.dispose();
//
//        return new Image(tempImg);
//    }
}
