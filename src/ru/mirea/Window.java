package ru.mirea;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Window extends JFrame {
    JTextField jta = new JTextField(10);
    public String cmd;
    Window(String cmd){
        super("Example");
        setLayout(new FlowLayout());
        setSize(1850,1080);
        jta.setForeground(Color.GREEN);
        setVisible(true);
        this.cmd=cmd;


    }


    @Override
    public void paint(Graphics g) {
        Image image;
        try
        {
            image = ImageIO.read(new File(cmd));
            g.drawImage(image,0,0,null);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

}
}
