package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("What is the dollar price? ");
        double priceDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantityBuy = sc.nextDouble();

        double calculator = CurrencyConverter.converter(quantityBuy, priceDollar);

        System.out.println("Amount to be paid in reais = " + calculator);
        sc.close();

    }
    
}
