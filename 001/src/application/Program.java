package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rect.height = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.println(rect);

        sc.close();

    }
    
}
