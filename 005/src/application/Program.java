package application;

import java.util.Locale;
import java.util.Scanner;

import services.ProductService;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductService account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if (option == 'y'){

            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();

            account = new ProductService(accountNumber, name, amount);
        
        }

        else{

            account = new ProductService(accountNumber, name);

        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter  a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter  a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);

        sc.close();

        
    }
}

