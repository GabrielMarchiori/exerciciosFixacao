package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import status.EnumOrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Client client = new Client(nameClient, email, birthDate);
        LocalDateTime moment = LocalDateTime.now();

        Order order = new Order(moment, EnumOrderStatus.valueOf(status), client);

        System.out.println();
        System.out.print("How many items to this order? ");
        int totalItens = sc.nextInt();
        
        for(int repeat = 1; repeat<=totalItens; repeat++){
            System.out.println("Enter #"+repeat+" item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            
            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);

            
            order.addItem(orderItem);
            System.out.println();
            
        }

        System.out.println(order);
        

        sc.close();
       
    }
}
