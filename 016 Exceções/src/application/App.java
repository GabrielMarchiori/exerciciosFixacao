package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Account;
import model_exception.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Account> list = new ArrayList<>();
        char c;
        int size = 0;
       
    
        do{
            
            System.out.println("Enter account data");
            
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            list.add(new Account(number, holder, balance, withdrawLimit));
            System.out.print("Enter amount for withdraw:");
            double amount = sc.nextDouble();

            try{
        
                list.get(size).withdraw(amount);

            }
            catch(DomainException e){
                System.out.println("Withdraw error: "+e.getMessage());
            }
            catch (RuntimeException e){
                System.out.println("Unexpected error");
                e.printStackTrace();
            }

            System.out.println("Do you want to create add a new account?(y/n)");
            c = sc.next().charAt(0);
            size+=1;
            
        } while(c=='y');

            for(Account x : list){
                System.out.println(x);                
            }
            
        
        sc.close();
    }
}
