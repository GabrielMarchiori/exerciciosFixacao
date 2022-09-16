package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for(int repeat=1; repeat<=numberProducts; repeat++){
            System.out.println("Product #" + repeat + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(option == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));


                products.add(new UsedProduct(name, price, date));
            }

            else if(option == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            }

            else{
                products.add(new Product(name, price));
            }
            
        }

        System.out.println("PRICE TAGS:");
            for(Product prod : products){
                System.out.println(prod);
            }
            
        sc.close();
    }
}