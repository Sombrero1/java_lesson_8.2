package ru.mirea;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Window extends JFrame {

    Image image;
    String cmd;

    Window(String cmd){
        super("Example");

        this.cmd=cmd;


        try {
            image = ImageIO.read(new File(cmd));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0,0,image.getHeight(null),image.getWidth(null));

        Container container = getContentPane();
        container.setLayout(new GridLayout());


        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE); // выход при закрытии

    }


    @Override
    public void paint(Graphics g) {

            if(image!=null) {
                g.drawImage(image, 0, 0, null);
            }
}
}
