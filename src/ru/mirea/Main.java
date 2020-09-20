package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            System.out.println("Просто картинка: 0");
            System.out.println("Анимация 1");
            int a=new Scanner(System.in).nextInt();

            if(a==1) {
                ThreadAnimation animation = new ThreadAnimation(args);
                animation.run();
            }
            else{
                new Window(args[0]);
            }
    }
}
