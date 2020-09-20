package ru.mirea;

import javax.swing.plaf.IconUIResource;

public class ThreadAnimation implements Runnable {
    private Window mainWindow;
    private String []cmdArgs;
    private static int counter=0;

    ThreadAnimation(String []args){
        cmdArgs=args;

        mainWindow=new Window(args[0]);
        while (true)
        run();


    }


    @Override
    public void run() {


        try {
            Thread.sleep(2000);
            counter=(counter+1)%cmdArgs.length;
            mainWindow.selectPicture(cmdArgs[counter]);
//            mainWindow.setVisible(false);
//            mainWindow.setVisible(true);
            mainWindow.paint(mainWindow.getGraphics());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
